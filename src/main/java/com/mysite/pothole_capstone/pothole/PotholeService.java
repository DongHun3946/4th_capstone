package com.mysite.pothole_capstone.pothole;

import com.mysite.pothole_capstone.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.mysite.pothole_capstone.user.User;

import java.time.LocalDateTime;
import java.util.*;
@RequiredArgsConstructor
@Service
public class PotholeService {
    private final PotholeRepository potholeRepository;
    public Page<Pothole> getList(User user, int page){
        Pageable pageable = PageRequest.of(page,10);
        return this.potholeRepository.findByUser(user, pageable);
    }
    public Page<Pothole> getListAll(int page){
        Pageable pageable = PageRequest.of(page, 11);
        return this.potholeRepository.findAll(pageable);
    }
    public List<Integer> getCount(User user, String keyword){
        List<Integer> oa = new ArrayList<>();
        oa.add(this.potholeRepository.countByUserAndStateContaining(user, "접수 중"));
        oa.add(this.potholeRepository.countByUserAndStateContaining(user, "접수 실패"));
        oa.add(this.potholeRepository.countByUserAndStateContaining(user, "접수 완료"));
        oa.add(this.potholeRepository.countByUserAndStateContaining(user, "수리 중"));
        oa.add(this.potholeRepository.countByUserAndStateContaining(user, "수리 완료"));
        return oa;
    }
    public Page<Pothole> getSelectList(String state, int page){
        Pageable pageable = PageRequest.of(page, 11);
        Page<Pothole> oa = null;
        switch (state) {
            case "1":
                oa = this.potholeRepository.findByState("접수 중", pageable);
                break;
            case "2":
                oa = this.potholeRepository.findByState("접수 실패", pageable);
                break;
            case "3":
                oa = this.potholeRepository.findByState("접수 완료", pageable);
                break;
            case "4":
                oa = this.potholeRepository.findByState("수리 중", pageable);
                break;
            case "5":
                oa = this.potholeRepository.findByState("수리 완료", pageable);
                break;
            case "6":
                oa = this.potholeRepository.findAll(pageable);
                break;
            default:
                break;
        }
        return oa;
    }
}
