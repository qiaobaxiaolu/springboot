package com.liu.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUIdIsNull() {
			addCriterion("u_id is null");
			return (Criteria) this;
		}

		public Criteria andUIdIsNotNull() {
			addCriterion("u_id is not null");
			return (Criteria) this;
		}

		public Criteria andUIdEqualTo(Integer value) {
			addCriterion("u_id =", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotEqualTo(Integer value) {
			addCriterion("u_id <>", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThan(Integer value) {
			addCriterion("u_id >", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("u_id >=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThan(Integer value) {
			addCriterion("u_id <", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThanOrEqualTo(Integer value) {
			addCriterion("u_id <=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdIn(List<Integer> values) {
			addCriterion("u_id in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotIn(List<Integer> values) {
			addCriterion("u_id not in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdBetween(Integer value1, Integer value2) {
			addCriterion("u_id between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotBetween(Integer value1, Integer value2) {
			addCriterion("u_id not between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andULoginNameIsNull() {
			addCriterion("u_login_name is null");
			return (Criteria) this;
		}

		public Criteria andULoginNameIsNotNull() {
			addCriterion("u_login_name is not null");
			return (Criteria) this;
		}

		public Criteria andULoginNameEqualTo(String value) {
			addCriterion("u_login_name =", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameNotEqualTo(String value) {
			addCriterion("u_login_name <>", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameGreaterThan(String value) {
			addCriterion("u_login_name >", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameGreaterThanOrEqualTo(String value) {
			addCriterion("u_login_name >=", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameLessThan(String value) {
			addCriterion("u_login_name <", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameLessThanOrEqualTo(String value) {
			addCriterion("u_login_name <=", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameLike(String value) {
			addCriterion("u_login_name like", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameNotLike(String value) {
			addCriterion("u_login_name not like", value, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameIn(List<String> values) {
			addCriterion("u_login_name in", values, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameNotIn(List<String> values) {
			addCriterion("u_login_name not in", values, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameBetween(String value1, String value2) {
			addCriterion("u_login_name between", value1, value2, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andULoginNameNotBetween(String value1, String value2) {
			addCriterion("u_login_name not between", value1, value2, "uLoginName");
			return (Criteria) this;
		}

		public Criteria andUPasswordIsNull() {
			addCriterion("u_password is null");
			return (Criteria) this;
		}

		public Criteria andUPasswordIsNotNull() {
			addCriterion("u_password is not null");
			return (Criteria) this;
		}

		public Criteria andUPasswordEqualTo(String value) {
			addCriterion("u_password =", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotEqualTo(String value) {
			addCriterion("u_password <>", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordGreaterThan(String value) {
			addCriterion("u_password >", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("u_password >=", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordLessThan(String value) {
			addCriterion("u_password <", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordLessThanOrEqualTo(String value) {
			addCriterion("u_password <=", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordLike(String value) {
			addCriterion("u_password like", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotLike(String value) {
			addCriterion("u_password not like", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordIn(List<String> values) {
			addCriterion("u_password in", values, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotIn(List<String> values) {
			addCriterion("u_password not in", values, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordBetween(String value1, String value2) {
			addCriterion("u_password between", value1, value2, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotBetween(String value1, String value2) {
			addCriterion("u_password not between", value1, value2, "uPassword");
			return (Criteria) this;
		}

		public Criteria andULoginStateIsNull() {
			addCriterion("u_login_state is null");
			return (Criteria) this;
		}

		public Criteria andULoginStateIsNotNull() {
			addCriterion("u_login_state is not null");
			return (Criteria) this;
		}

		public Criteria andULoginStateEqualTo(Integer value) {
			addCriterion("u_login_state =", value, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateNotEqualTo(Integer value) {
			addCriterion("u_login_state <>", value, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateGreaterThan(Integer value) {
			addCriterion("u_login_state >", value, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateGreaterThanOrEqualTo(Integer value) {
			addCriterion("u_login_state >=", value, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateLessThan(Integer value) {
			addCriterion("u_login_state <", value, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateLessThanOrEqualTo(Integer value) {
			addCriterion("u_login_state <=", value, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateIn(List<Integer> values) {
			addCriterion("u_login_state in", values, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateNotIn(List<Integer> values) {
			addCriterion("u_login_state not in", values, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateBetween(Integer value1, Integer value2) {
			addCriterion("u_login_state between", value1, value2, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andULoginStateNotBetween(Integer value1, Integer value2) {
			addCriterion("u_login_state not between", value1, value2, "uLoginState");
			return (Criteria) this;
		}

		public Criteria andUTypeIsNull() {
			addCriterion("u_type is null");
			return (Criteria) this;
		}

		public Criteria andUTypeIsNotNull() {
			addCriterion("u_type is not null");
			return (Criteria) this;
		}

		public Criteria andUTypeEqualTo(Integer value) {
			addCriterion("u_type =", value, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeNotEqualTo(Integer value) {
			addCriterion("u_type <>", value, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeGreaterThan(Integer value) {
			addCriterion("u_type >", value, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("u_type >=", value, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeLessThan(Integer value) {
			addCriterion("u_type <", value, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeLessThanOrEqualTo(Integer value) {
			addCriterion("u_type <=", value, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeIn(List<Integer> values) {
			addCriterion("u_type in", values, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeNotIn(List<Integer> values) {
			addCriterion("u_type not in", values, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeBetween(Integer value1, Integer value2) {
			addCriterion("u_type between", value1, value2, "uType");
			return (Criteria) this;
		}

		public Criteria andUTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("u_type not between", value1, value2, "uType");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}