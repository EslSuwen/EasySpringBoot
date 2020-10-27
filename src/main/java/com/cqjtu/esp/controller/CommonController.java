package com.cqjtu.esp.controller;

import com.cqjtu.esp.dto.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通用-前端控制器
 *
 * @author suwen
 * @since 2020-10-27
 */
@Api(tags = "通用-前端控制器")
@RestController
@RequestMapping("/")
public class CommonController {

  /**
   * 主页信息
   *
   * @return org.springframework.http.ResponseEntity<com.cqjtu.esp.dto.Result>
   * @author suwen
   * @date 2020/10/27 10:27
   */
  @ApiOperation("主页信息")
  @GetMapping
  public ResponseEntity<Result> index() {
    return Result.success("hello world!");
  }
}
