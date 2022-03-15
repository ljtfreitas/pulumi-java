// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityScanConfigScheduleGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityScanConfigState extends io.pulumi.resources.ResourceArgs {

    public static final SecurityScanConfigState Empty = new SecurityScanConfigState();

    /**
     * The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<SecurityScanConfigAuthenticationGetArgs> authentication;

    public Output<SecurityScanConfigAuthenticationGetArgs> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    /**
     * The blacklist URL patterns as described in
     * https://cloud.google.com/security-scanner/docs/excluded-urls
     * 
     */
    @Import(name="blacklistPatterns")
      private final @Nullable Output<List<String>> blacklistPatterns;

    public Output<List<String>> getBlacklistPatterns() {
        return this.blacklistPatterns == null ? Output.empty() : this.blacklistPatterns;
    }

    /**
     * The user provider display name of the ScanConfig.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Controls export of scan configurations and results to Cloud Security Command Center.
     * Default value is `ENABLED`.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    @Import(name="exportToSecurityCommandCenter")
      private final @Nullable Output<String> exportToSecurityCommandCenter;

    public Output<String> getExportToSecurityCommandCenter() {
        return this.exportToSecurityCommandCenter == null ? Output.empty() : this.exportToSecurityCommandCenter;
    }

    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
     * Defaults to 15.
     * 
     */
    @Import(name="maxQps")
      private final @Nullable Output<Integer> maxQps;

    public Output<Integer> getMaxQps() {
        return this.maxQps == null ? Output.empty() : this.maxQps;
    }

    /**
     * A server defined name for this index. Format: 'projects/{{project}}/scanConfigs/{{server_generated_id}}'
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The schedule of the ScanConfig
     * Structure is documented below.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<SecurityScanConfigScheduleGetArgs> schedule;

    public Output<SecurityScanConfigScheduleGetArgs> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * The starting URLs from which the scanner finds site pages.
     * 
     */
    @Import(name="startingUrls")
      private final @Nullable Output<List<String>> startingUrls;

    public Output<List<String>> getStartingUrls() {
        return this.startingUrls == null ? Output.empty() : this.startingUrls;
    }

    /**
     * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * Each value may be one of `APP_ENGINE` and `COMPUTE`.
     * 
     */
    @Import(name="targetPlatforms")
      private final @Nullable Output<List<String>> targetPlatforms;

    public Output<List<String>> getTargetPlatforms() {
        return this.targetPlatforms == null ? Output.empty() : this.targetPlatforms;
    }

    /**
     * Type of the user agents used for scanning
     * Default value is `CHROME_LINUX`.
     * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
     * 
     */
    @Import(name="userAgent")
      private final @Nullable Output<String> userAgent;

    public Output<String> getUserAgent() {
        return this.userAgent == null ? Output.empty() : this.userAgent;
    }

    public SecurityScanConfigState(
        @Nullable Output<SecurityScanConfigAuthenticationGetArgs> authentication,
        @Nullable Output<List<String>> blacklistPatterns,
        @Nullable Output<String> displayName,
        @Nullable Output<String> exportToSecurityCommandCenter,
        @Nullable Output<Integer> maxQps,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<SecurityScanConfigScheduleGetArgs> schedule,
        @Nullable Output<List<String>> startingUrls,
        @Nullable Output<List<String>> targetPlatforms,
        @Nullable Output<String> userAgent) {
        this.authentication = authentication;
        this.blacklistPatterns = blacklistPatterns;
        this.displayName = displayName;
        this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
        this.maxQps = maxQps;
        this.name = name;
        this.project = project;
        this.schedule = schedule;
        this.startingUrls = startingUrls;
        this.targetPlatforms = targetPlatforms;
        this.userAgent = userAgent;
    }

    private SecurityScanConfigState() {
        this.authentication = Output.empty();
        this.blacklistPatterns = Output.empty();
        this.displayName = Output.empty();
        this.exportToSecurityCommandCenter = Output.empty();
        this.maxQps = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.schedule = Output.empty();
        this.startingUrls = Output.empty();
        this.targetPlatforms = Output.empty();
        this.userAgent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityScanConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityScanConfigAuthenticationGetArgs> authentication;
        private @Nullable Output<List<String>> blacklistPatterns;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> exportToSecurityCommandCenter;
        private @Nullable Output<Integer> maxQps;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<SecurityScanConfigScheduleGetArgs> schedule;
        private @Nullable Output<List<String>> startingUrls;
        private @Nullable Output<List<String>> targetPlatforms;
        private @Nullable Output<String> userAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityScanConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.blacklistPatterns = defaults.blacklistPatterns;
    	      this.displayName = defaults.displayName;
    	      this.exportToSecurityCommandCenter = defaults.exportToSecurityCommandCenter;
    	      this.maxQps = defaults.maxQps;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.startingUrls = defaults.startingUrls;
    	      this.targetPlatforms = defaults.targetPlatforms;
    	      this.userAgent = defaults.userAgent;
        }

        public Builder authentication(@Nullable Output<SecurityScanConfigAuthenticationGetArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder authentication(@Nullable SecurityScanConfigAuthenticationGetArgs authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }

        public Builder blacklistPatterns(@Nullable Output<List<String>> blacklistPatterns) {
            this.blacklistPatterns = blacklistPatterns;
            return this;
        }

        public Builder blacklistPatterns(@Nullable List<String> blacklistPatterns) {
            this.blacklistPatterns = Output.ofNullable(blacklistPatterns);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder exportToSecurityCommandCenter(@Nullable Output<String> exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
            return this;
        }

        public Builder exportToSecurityCommandCenter(@Nullable String exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = Output.ofNullable(exportToSecurityCommandCenter);
            return this;
        }

        public Builder maxQps(@Nullable Output<Integer> maxQps) {
            this.maxQps = maxQps;
            return this;
        }

        public Builder maxQps(@Nullable Integer maxQps) {
            this.maxQps = Output.ofNullable(maxQps);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder schedule(@Nullable Output<SecurityScanConfigScheduleGetArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable SecurityScanConfigScheduleGetArgs schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }

        public Builder startingUrls(@Nullable Output<List<String>> startingUrls) {
            this.startingUrls = startingUrls;
            return this;
        }

        public Builder startingUrls(@Nullable List<String> startingUrls) {
            this.startingUrls = Output.ofNullable(startingUrls);
            return this;
        }

        public Builder targetPlatforms(@Nullable Output<List<String>> targetPlatforms) {
            this.targetPlatforms = targetPlatforms;
            return this;
        }

        public Builder targetPlatforms(@Nullable List<String> targetPlatforms) {
            this.targetPlatforms = Output.ofNullable(targetPlatforms);
            return this;
        }

        public Builder userAgent(@Nullable Output<String> userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder userAgent(@Nullable String userAgent) {
            this.userAgent = Output.ofNullable(userAgent);
            return this;
        }
        public SecurityScanConfigState build() {
            return new SecurityScanConfigState(authentication, blacklistPatterns, displayName, exportToSecurityCommandCenter, maxQps, name, project, schedule, startingUrls, targetPlatforms, userAgent);
        }
    }
}
