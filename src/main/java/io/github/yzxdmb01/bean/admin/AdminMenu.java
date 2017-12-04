package io.github.yzxdmb01.bean.admin;

import java.util.Date;
import java.util.List;

public class AdminMenu {
    private Long id;

    private Long sort;

    private String title;

    private String icon;

    private String href;

    private Byte spread;

    private String parentId;

    private Date createTime;

    private Date updateTime;

    private List<AdminMenu> menus;

	public List<AdminMenu> getMenus() {
		return menus;
	}

	public void setMenus(List<AdminMenu> menus) {
		this.menus = menus;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public Byte getSpread() {
        return spread;
    }

    public void setSpread(Byte spread) {
        this.spread = spread;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	@Override
	public String toString() {
		return "AdminMenu{" +
				"title='" + title + '\'' +
				", parentId='" + parentId + '\'' +
				", menus=" + menus +
				'}';
	}
}