// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanConfigExportToSecurityCommandCenter;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanConfigRiskLevel;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanConfigTargetPlatformsItem;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanConfigUserAgent;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.AuthenticationArgs;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScanRunArgs;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScheduleArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScanConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScanConfigArgs Empty = new ScanConfigArgs();

    /**
     * The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    @InputImport(name="authentication")
      private final @Nullable Input<AuthenticationArgs> authentication;

    public Input<AuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    /**
     * The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    @InputImport(name="blacklistPatterns")
      private final @Nullable Input<List<String>> blacklistPatterns;

    public Input<List<String>> getBlacklistPatterns() {
        return this.blacklistPatterns == null ? Input.empty() : this.blacklistPatterns;
    }

    /**
     * The user provided display name of the ScanConfig.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Controls export of scan configurations and results to Security Command Center.
     * 
     */
    @InputImport(name="exportToSecurityCommandCenter")
      private final @Nullable Input<ScanConfigExportToSecurityCommandCenter> exportToSecurityCommandCenter;

    public Input<ScanConfigExportToSecurityCommandCenter> getExportToSecurityCommandCenter() {
        return this.exportToSecurityCommandCenter == null ? Input.empty() : this.exportToSecurityCommandCenter;
    }

    /**
     * Whether to keep scanning even if most requests return HTTP error codes.
     * 
     */
    @InputImport(name="ignoreHttpStatusErrors")
      private final @Nullable Input<Boolean> ignoreHttpStatusErrors;

    public Input<Boolean> getIgnoreHttpStatusErrors() {
        return this.ignoreHttpStatusErrors == null ? Input.empty() : this.ignoreHttpStatusErrors;
    }

    /**
     * Latest ScanRun if available.
     * 
     */
    @InputImport(name="latestRun")
      private final @Nullable Input<ScanRunArgs> latestRun;

    public Input<ScanRunArgs> getLatestRun() {
        return this.latestRun == null ? Input.empty() : this.latestRun;
    }

    /**
     * Whether the scan config is managed by Web Security Scanner, output only.
     * 
     */
    @InputImport(name="managedScan")
      private final @Nullable Input<Boolean> managedScan;

    public Input<Boolean> getManagedScan() {
        return this.managedScan == null ? Input.empty() : this.managedScan;
    }

    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    @InputImport(name="maxQps")
      private final @Nullable Input<Integer> maxQps;

    public Input<Integer> getMaxQps() {
        return this.maxQps == null ? Input.empty() : this.maxQps;
    }

    /**
     * The resource name of the ScanConfig. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the system.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The risk level selected for the scan
     * 
     */
    @InputImport(name="riskLevel")
      private final @Nullable Input<ScanConfigRiskLevel> riskLevel;

    public Input<ScanConfigRiskLevel> getRiskLevel() {
        return this.riskLevel == null ? Input.empty() : this.riskLevel;
    }

    /**
     * The schedule of the ScanConfig.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<ScheduleArgs> schedule;

    public Input<ScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The starting URLs from which the scanner finds site pages.
     * 
     */
    @InputImport(name="startingUrls", required=true)
      private final Input<List<String>> startingUrls;

    public Input<List<String>> getStartingUrls() {
        return this.startingUrls;
    }

    /**
     * Whether the scan configuration has enabled static IP address scan feature. If enabled, the scanner will access applications from static IP addresses.
     * 
     */
    @InputImport(name="staticIpScan")
      private final @Nullable Input<Boolean> staticIpScan;

    public Input<Boolean> getStaticIpScan() {
        return this.staticIpScan == null ? Input.empty() : this.staticIpScan;
    }

    /**
     * Set of Google Cloud platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * 
     */
    @InputImport(name="targetPlatforms")
      private final @Nullable Input<List<ScanConfigTargetPlatformsItem>> targetPlatforms;

    public Input<List<ScanConfigTargetPlatformsItem>> getTargetPlatforms() {
        return this.targetPlatforms == null ? Input.empty() : this.targetPlatforms;
    }

    /**
     * The user agent used during scanning.
     * 
     */
    @InputImport(name="userAgent")
      private final @Nullable Input<ScanConfigUserAgent> userAgent;

    public Input<ScanConfigUserAgent> getUserAgent() {
        return this.userAgent == null ? Input.empty() : this.userAgent;
    }

    public ScanConfigArgs(
        @Nullable Input<AuthenticationArgs> authentication,
        @Nullable Input<List<String>> blacklistPatterns,
        Input<String> displayName,
        @Nullable Input<ScanConfigExportToSecurityCommandCenter> exportToSecurityCommandCenter,
        @Nullable Input<Boolean> ignoreHttpStatusErrors,
        @Nullable Input<ScanRunArgs> latestRun,
        @Nullable Input<Boolean> managedScan,
        @Nullable Input<Integer> maxQps,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<ScanConfigRiskLevel> riskLevel,
        @Nullable Input<ScheduleArgs> schedule,
        Input<List<String>> startingUrls,
        @Nullable Input<Boolean> staticIpScan,
        @Nullable Input<List<ScanConfigTargetPlatformsItem>> targetPlatforms,
        @Nullable Input<ScanConfigUserAgent> userAgent) {
        this.authentication = authentication;
        this.blacklistPatterns = blacklistPatterns;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
        this.ignoreHttpStatusErrors = ignoreHttpStatusErrors;
        this.latestRun = latestRun;
        this.managedScan = managedScan;
        this.maxQps = maxQps;
        this.name = name;
        this.project = project;
        this.riskLevel = riskLevel;
        this.schedule = schedule;
        this.startingUrls = Objects.requireNonNull(startingUrls, "expected parameter 'startingUrls' to be non-null");
        this.staticIpScan = staticIpScan;
        this.targetPlatforms = targetPlatforms;
        this.userAgent = userAgent;
    }

    private ScanConfigArgs() {
        this.authentication = Input.empty();
        this.blacklistPatterns = Input.empty();
        this.displayName = Input.empty();
        this.exportToSecurityCommandCenter = Input.empty();
        this.ignoreHttpStatusErrors = Input.empty();
        this.latestRun = Input.empty();
        this.managedScan = Input.empty();
        this.maxQps = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.riskLevel = Input.empty();
        this.schedule = Input.empty();
        this.startingUrls = Input.empty();
        this.staticIpScan = Input.empty();
        this.targetPlatforms = Input.empty();
        this.userAgent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthenticationArgs> authentication;
        private @Nullable Input<List<String>> blacklistPatterns;
        private Input<String> displayName;
        private @Nullable Input<ScanConfigExportToSecurityCommandCenter> exportToSecurityCommandCenter;
        private @Nullable Input<Boolean> ignoreHttpStatusErrors;
        private @Nullable Input<ScanRunArgs> latestRun;
        private @Nullable Input<Boolean> managedScan;
        private @Nullable Input<Integer> maxQps;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<ScanConfigRiskLevel> riskLevel;
        private @Nullable Input<ScheduleArgs> schedule;
        private Input<List<String>> startingUrls;
        private @Nullable Input<Boolean> staticIpScan;
        private @Nullable Input<List<ScanConfigTargetPlatformsItem>> targetPlatforms;
        private @Nullable Input<ScanConfigUserAgent> userAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.blacklistPatterns = defaults.blacklistPatterns;
    	      this.displayName = defaults.displayName;
    	      this.exportToSecurityCommandCenter = defaults.exportToSecurityCommandCenter;
    	      this.ignoreHttpStatusErrors = defaults.ignoreHttpStatusErrors;
    	      this.latestRun = defaults.latestRun;
    	      this.managedScan = defaults.managedScan;
    	      this.maxQps = defaults.maxQps;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.riskLevel = defaults.riskLevel;
    	      this.schedule = defaults.schedule;
    	      this.startingUrls = defaults.startingUrls;
    	      this.staticIpScan = defaults.staticIpScan;
    	      this.targetPlatforms = defaults.targetPlatforms;
    	      this.userAgent = defaults.userAgent;
        }

        public Builder setAuthentication(@Nullable Input<AuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable AuthenticationArgs authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder setBlacklistPatterns(@Nullable Input<List<String>> blacklistPatterns) {
            this.blacklistPatterns = blacklistPatterns;
            return this;
        }

        public Builder setBlacklistPatterns(@Nullable List<String> blacklistPatterns) {
            this.blacklistPatterns = Input.ofNullable(blacklistPatterns);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setExportToSecurityCommandCenter(@Nullable Input<ScanConfigExportToSecurityCommandCenter> exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
            return this;
        }

        public Builder setExportToSecurityCommandCenter(@Nullable ScanConfigExportToSecurityCommandCenter exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = Input.ofNullable(exportToSecurityCommandCenter);
            return this;
        }

        public Builder setIgnoreHttpStatusErrors(@Nullable Input<Boolean> ignoreHttpStatusErrors) {
            this.ignoreHttpStatusErrors = ignoreHttpStatusErrors;
            return this;
        }

        public Builder setIgnoreHttpStatusErrors(@Nullable Boolean ignoreHttpStatusErrors) {
            this.ignoreHttpStatusErrors = Input.ofNullable(ignoreHttpStatusErrors);
            return this;
        }

        public Builder setLatestRun(@Nullable Input<ScanRunArgs> latestRun) {
            this.latestRun = latestRun;
            return this;
        }

        public Builder setLatestRun(@Nullable ScanRunArgs latestRun) {
            this.latestRun = Input.ofNullable(latestRun);
            return this;
        }

        public Builder setManagedScan(@Nullable Input<Boolean> managedScan) {
            this.managedScan = managedScan;
            return this;
        }

        public Builder setManagedScan(@Nullable Boolean managedScan) {
            this.managedScan = Input.ofNullable(managedScan);
            return this;
        }

        public Builder setMaxQps(@Nullable Input<Integer> maxQps) {
            this.maxQps = maxQps;
            return this;
        }

        public Builder setMaxQps(@Nullable Integer maxQps) {
            this.maxQps = Input.ofNullable(maxQps);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRiskLevel(@Nullable Input<ScanConfigRiskLevel> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        public Builder setRiskLevel(@Nullable ScanConfigRiskLevel riskLevel) {
            this.riskLevel = Input.ofNullable(riskLevel);
            return this;
        }

        public Builder setSchedule(@Nullable Input<ScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable ScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setStartingUrls(Input<List<String>> startingUrls) {
            this.startingUrls = Objects.requireNonNull(startingUrls);
            return this;
        }

        public Builder setStartingUrls(List<String> startingUrls) {
            this.startingUrls = Input.of(Objects.requireNonNull(startingUrls));
            return this;
        }

        public Builder setStaticIpScan(@Nullable Input<Boolean> staticIpScan) {
            this.staticIpScan = staticIpScan;
            return this;
        }

        public Builder setStaticIpScan(@Nullable Boolean staticIpScan) {
            this.staticIpScan = Input.ofNullable(staticIpScan);
            return this;
        }

        public Builder setTargetPlatforms(@Nullable Input<List<ScanConfigTargetPlatformsItem>> targetPlatforms) {
            this.targetPlatforms = targetPlatforms;
            return this;
        }

        public Builder setTargetPlatforms(@Nullable List<ScanConfigTargetPlatformsItem> targetPlatforms) {
            this.targetPlatforms = Input.ofNullable(targetPlatforms);
            return this;
        }

        public Builder setUserAgent(@Nullable Input<ScanConfigUserAgent> userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder setUserAgent(@Nullable ScanConfigUserAgent userAgent) {
            this.userAgent = Input.ofNullable(userAgent);
            return this;
        }
        public ScanConfigArgs build() {
            return new ScanConfigArgs(authentication, blacklistPatterns, displayName, exportToSecurityCommandCenter, ignoreHttpStatusErrors, latestRun, managedScan, maxQps, name, project, riskLevel, schedule, startingUrls, staticIpScan, targetPlatforms, userAgent);
        }
    }
}
