/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateAlarmRequest extends RpcAcsRequest<UpdateAlarmResponse> {
	
	public UpdateAlarmRequest() {
		super("Cms", "2017-03-01", "UpdateAlarm");
	}

	private String callby_cms_owner;

	private String id;

	private String name;

	private Integer period;

	private String statistics;

	private String comparisonOperator;

	private String threshold;

	private String contactGroups;

	private Integer startTime;

	private Integer endTime;

	private Integer silenceTime;

	private Integer evaluationCount;

	private Integer notifyType;

	public String getcallby_cms_owner() {
		return this.callby_cms_owner;
	}

	public void setcallby_cms_owner(String callby_cms_owner) {
		this.callby_cms_owner = callby_cms_owner;
		putQueryParameter("callby_cms_owner", callby_cms_owner);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		putQueryParameter("Id", id);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		putQueryParameter("Period", period);
	}

	public String getStatistics() {
		return this.statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
		putQueryParameter("Statistics", statistics);
	}

	public String getComparisonOperator() {
		return this.comparisonOperator;
	}

	public void setComparisonOperator(String comparisonOperator) {
		this.comparisonOperator = comparisonOperator;
		putQueryParameter("ComparisonOperator", comparisonOperator);
	}

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		putQueryParameter("Threshold", threshold);
	}

	public String getContactGroups() {
		return this.contactGroups;
	}

	public void setContactGroups(String contactGroups) {
		this.contactGroups = contactGroups;
		putQueryParameter("ContactGroups", contactGroups);
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		putQueryParameter("StartTime", startTime);
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		putQueryParameter("EndTime", endTime);
	}

	public Integer getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Integer silenceTime) {
		this.silenceTime = silenceTime;
		putQueryParameter("SilenceTime", silenceTime);
	}

	public Integer getEvaluationCount() {
		return this.evaluationCount;
	}

	public void setEvaluationCount(Integer evaluationCount) {
		this.evaluationCount = evaluationCount;
		putQueryParameter("EvaluationCount", evaluationCount);
	}

	public Integer getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(Integer notifyType) {
		this.notifyType = notifyType;
		putQueryParameter("NotifyType", notifyType);
	}

	@Override
	public Class<UpdateAlarmResponse> getResponseClass() {
		return UpdateAlarmResponse.class;
	}

}
