/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.mu.cmt.pfs.pfsdb.VRft90201;
import com.mu.cmt.pfs.pfsdb.VRft90201Id;
import com.mu.cmt.pfs.pfsdb.service.VRft90201Service;


/**
 * Controller object for domain model class VRft90201.
 * @see VRft90201
 */
@RestController("pfsdb.VRft90201Controller")
@Api(value = "VRft90201Controller", description = "Exposes APIs to work with VRft90201 resource.")
@RequestMapping("/pfsdb/VRft90201")
public class VRft90201Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(VRft90201Controller.class);

    @Autowired
	@Qualifier("pfsdb.VRft90201Service")
	private VRft90201Service vRft90201Service;

	@ApiOperation(value = "Creates a new VRft90201 instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VRft90201 createVRft90201(@RequestBody VRft90201 vrft90201) {
		LOGGER.debug("Create VRft90201 with information: {}" , vrft90201);

		vrft90201 = vRft90201Service.create(vrft90201);
		LOGGER.debug("Created VRft90201 with information: {}" , vrft90201);

	    return vrft90201;
	}

@ApiOperation(value = "Returns the VRft90201 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VRft90201 getVRft90201(@RequestParam("userid") String userid,@RequestParam("appid") String appid,@RequestParam("approle") String approle,@RequestParam("rolename") String rolename) throws EntityNotFoundException {

        VRft90201Id vrft90201Id = new VRft90201Id();
        vrft90201Id.setUserid(userid);
        vrft90201Id.setAppid(appid);
        vrft90201Id.setApprole(approle);
        vrft90201Id.setRolename(rolename);

        LOGGER.debug("Getting VRft90201 with id: {}" , vrft90201Id);
        VRft90201 vrft90201 = vRft90201Service.getById(vrft90201Id);
        LOGGER.debug("VRft90201 details with id: {}" , vrft90201);

        return vrft90201;
    }



    @ApiOperation(value = "Updates the VRft90201 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VRft90201 editVRft90201(@RequestParam("userid") String userid,@RequestParam("appid") String appid,@RequestParam("approle") String approle,@RequestParam("rolename") String rolename, @RequestBody VRft90201 vrft90201) throws EntityNotFoundException {

        vrft90201.setUserid(userid);
        vrft90201.setAppid(appid);
        vrft90201.setApprole(approle);
        vrft90201.setRolename(rolename);

        LOGGER.debug("VRft90201 details with id is updated with: {}" , vrft90201);

        return vRft90201Service.update(vrft90201);
    }


    @ApiOperation(value = "Deletes the VRft90201 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVRft90201(@RequestParam("userid") String userid,@RequestParam("appid") String appid,@RequestParam("approle") String approle,@RequestParam("rolename") String rolename) throws EntityNotFoundException {

        VRft90201Id vrft90201Id = new VRft90201Id();
        vrft90201Id.setUserid(userid);
        vrft90201Id.setAppid(appid);
        vrft90201Id.setApprole(approle);
        vrft90201Id.setRolename(rolename);

        LOGGER.debug("Deleting VRft90201 with id: {}" , vrft90201Id);
        VRft90201 vrft90201 = vRft90201Service.delete(vrft90201Id);

        return vrft90201 != null;
    }


    /**
     * @deprecated Use {@link #findVRft90201s(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of VRft90201 instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VRft90201> searchVRft90201sByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering VRft90201s list");
        return vRft90201Service.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of VRft90201 instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VRft90201> findVRft90201s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering VRft90201s list");
        return vRft90201Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of VRft90201 instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VRft90201> filterVRft90201s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering VRft90201s list");
        return vRft90201Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVRft90201s(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vRft90201Service.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of VRft90201 instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVRft90201s( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting VRft90201s");
		return vRft90201Service.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVRft90201AggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vRft90201Service.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service VRft90201Service instance
	 */
	protected void setVRft90201Service(VRft90201Service service) {
		this.vRft90201Service = service;
	}

}

