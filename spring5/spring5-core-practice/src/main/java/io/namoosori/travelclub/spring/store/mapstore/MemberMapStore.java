package io.namoosori.travelclub.spring.store.mapstore;

import io.namoosori.travelclub.spring.aggregate.club.CommunityMember;
import io.namoosori.travelclub.spring.service.MemberService;
import io.namoosori.travelclub.spring.store.MemberStore;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberMapStore implements MemberStore {

    private Map<String, CommunityMember> memberMap;

    public MemberMapStore() {
        this.memberMap = new LinkedHashMap<>();
    }

    @Override
    public String create(CommunityMember member) {
        return null;
    }

    @Override
    public CommunityMember retrieve(String memberId) {
        return null;
    }

    @Override
    public CommunityMember retrieveByEmail(String email) {
        return null;
    }

    @Override
    public List<CommunityMember> retrieveByName(String name) {
        return null;
    }

    @Override
    public void update(CommunityMember member) {

    }

    @Override
    public void delete(String email) {

    }

    @Override
    public boolean exists(String memberId) {
        return false;
    }
}
