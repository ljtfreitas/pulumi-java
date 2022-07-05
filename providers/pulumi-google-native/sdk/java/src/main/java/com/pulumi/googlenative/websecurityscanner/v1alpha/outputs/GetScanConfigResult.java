// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.websecurityscanner.v1alpha.outputs.AuthenticationResponse;
import com.pulumi.googlenative.websecurityscanner.v1alpha.outputs.ScanRunResponse;
import com.pulumi.googlenative.websecurityscanner.v1alpha.outputs.ScheduleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetScanConfigResult {
    /**
     * @return The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    private final AuthenticationResponse authentication;
    /**
     * @return The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    private final List<String> blacklistPatterns;
    /**
     * @return The user provided display name of the ScanConfig.
     * 
     */
    private final String displayName;
    /**
     * @return Latest ScanRun if available.
     * 
     */
    private final ScanRunResponse latestRun;
    /**
     * @return The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    private final Integer maxQps;
    /**
     * @return The resource name of the ScanConfig. The name follows the format of &#39;projects/{projectId}/scanConfigs/{scanConfigId}&#39;. The ScanConfig IDs are generated by the system.
     * 
     */
    private final String name;
    /**
     * @return The schedule of the ScanConfig.
     * 
     */
    private final ScheduleResponse schedule;
    /**
     * @return The starting URLs from which the scanner finds site pages.
     * 
     */
    private final List<String> startingUrls;
    /**
     * @return Set of Google Cloud platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * 
     */
    private final List<String> targetPlatforms;
    /**
     * @return The user agent used during scanning.
     * 
     */
    private final String userAgent;

    @CustomType.Constructor
    private GetScanConfigResult(
        @CustomType.Parameter("authentication") AuthenticationResponse authentication,
        @CustomType.Parameter("blacklistPatterns") List<String> blacklistPatterns,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("latestRun") ScanRunResponse latestRun,
        @CustomType.Parameter("maxQps") Integer maxQps,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedule") ScheduleResponse schedule,
        @CustomType.Parameter("startingUrls") List<String> startingUrls,
        @CustomType.Parameter("targetPlatforms") List<String> targetPlatforms,
        @CustomType.Parameter("userAgent") String userAgent) {
        this.authentication = authentication;
        this.blacklistPatterns = blacklistPatterns;
        this.displayName = displayName;
        this.latestRun = latestRun;
        this.maxQps = maxQps;
        this.name = name;
        this.schedule = schedule;
        this.startingUrls = startingUrls;
        this.targetPlatforms = targetPlatforms;
        this.userAgent = userAgent;
    }

    /**
     * @return The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    public AuthenticationResponse authentication() {
        return this.authentication;
    }
    /**
     * @return The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    public List<String> blacklistPatterns() {
        return this.blacklistPatterns;
    }
    /**
     * @return The user provided display name of the ScanConfig.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Latest ScanRun if available.
     * 
     */
    public ScanRunResponse latestRun() {
        return this.latestRun;
    }
    /**
     * @return The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    public Integer maxQps() {
        return this.maxQps;
    }
    /**
     * @return The resource name of the ScanConfig. The name follows the format of &#39;projects/{projectId}/scanConfigs/{scanConfigId}&#39;. The ScanConfig IDs are generated by the system.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The schedule of the ScanConfig.
     * 
     */
    public ScheduleResponse schedule() {
        return this.schedule;
    }
    /**
     * @return The starting URLs from which the scanner finds site pages.
     * 
     */
    public List<String> startingUrls() {
        return this.startingUrls;
    }
    /**
     * @return Set of Google Cloud platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * 
     */
    public List<String> targetPlatforms() {
        return this.targetPlatforms;
    }
    /**
     * @return The user agent used during scanning.
     * 
     */
    public String userAgent() {
        return this.userAgent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScanConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationResponse authentication;
        private List<String> blacklistPatterns;
        private String displayName;
        private ScanRunResponse latestRun;
        private Integer maxQps;
        private String name;
        private ScheduleResponse schedule;
        private List<String> startingUrls;
        private List<String> targetPlatforms;
        private String userAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScanConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.blacklistPatterns = defaults.blacklistPatterns;
    	      this.displayName = defaults.displayName;
    	      this.latestRun = defaults.latestRun;
    	      this.maxQps = defaults.maxQps;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.startingUrls = defaults.startingUrls;
    	      this.targetPlatforms = defaults.targetPlatforms;
    	      this.userAgent = defaults.userAgent;
        }

        public Builder authentication(AuthenticationResponse authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }
        public Builder blacklistPatterns(List<String> blacklistPatterns) {
            this.blacklistPatterns = Objects.requireNonNull(blacklistPatterns);
            return this;
        }
        public Builder blacklistPatterns(String... blacklistPatterns) {
            return blacklistPatterns(List.of(blacklistPatterns));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder latestRun(ScanRunResponse latestRun) {
            this.latestRun = Objects.requireNonNull(latestRun);
            return this;
        }
        public Builder maxQps(Integer maxQps) {
            this.maxQps = Objects.requireNonNull(maxQps);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedule(ScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder startingUrls(List<String> startingUrls) {
            this.startingUrls = Objects.requireNonNull(startingUrls);
            return this;
        }
        public Builder startingUrls(String... startingUrls) {
            return startingUrls(List.of(startingUrls));
        }
        public Builder targetPlatforms(List<String> targetPlatforms) {
            this.targetPlatforms = Objects.requireNonNull(targetPlatforms);
            return this;
        }
        public Builder targetPlatforms(String... targetPlatforms) {
            return targetPlatforms(List.of(targetPlatforms));
        }
        public Builder userAgent(String userAgent) {
            this.userAgent = Objects.requireNonNull(userAgent);
            return this;
        }        public GetScanConfigResult build() {
            return new GetScanConfigResult(authentication, blacklistPatterns, displayName, latestRun, maxQps, name, schedule, startingUrls, targetPlatforms, userAgent);
        }
    }
}
