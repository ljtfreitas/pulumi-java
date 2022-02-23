// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.Utilities;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Additional user-agent string to append to the default one (<prod_name>/<ver>).
     * 
     */
    @InputImport(name="appendUserAgent")
      private final @Nullable Input<String> appendUserAgent;

    public Input<String> getAppendUserAgent() {
        return this.appendUserAgent == null ? Input.empty() : this.appendUserAgent;
    }

    /**
     * This will disable the Pulumi Partner Name which is used if a custom `partnerName` isn't specified.
     * 
     */
    @InputImport(name="disablePartnerName", json=true)
      private final @Nullable Input<Boolean> disablePartnerName;

    public Input<Boolean> getDisablePartnerName() {
        return this.disablePartnerName == null ? Input.empty() : this.disablePartnerName;
    }

    /**
     * A Google Partner Name to facilitate partner resource usage attribution.
     * 
     */
    @InputImport(name="partnerName")
      private final @Nullable Input<String> partnerName;

    public Input<String> getPartnerName() {
        return this.partnerName == null ? Input.empty() : this.partnerName;
    }

    /**
     * The default project to manage resources in. If another project is specified on a resource, it will take precedence.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The default region to manage resources in. If another region is specified on a regional resource, it will take precedence.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The default zone to manage resources in. Generally, this zone should be within the default region you specified. If another zone is specified on a zonal resource, it will take precedence.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public ProviderArgs(
        @Nullable Input<String> appendUserAgent,
        @Nullable Input<Boolean> disablePartnerName,
        @Nullable Input<String> partnerName,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> zone) {
        this.appendUserAgent = appendUserAgent == null ? Input.ofNullable(Utilities.getEnv("GOOGLE_APPEND_USER_AGENT").orElse(null)) : appendUserAgent;
        this.disablePartnerName = disablePartnerName == null ? Input.ofNullable(Utilities.getEnvBoolean("GOOGLE_DISABLE_PARTNER_NAME").orElse(null)) : disablePartnerName;
        this.partnerName = partnerName == null ? Input.ofNullable(Utilities.getEnv("GOOGLE_PARTNER_NAME").orElse(null)) : partnerName;
        this.project = project == null ? Input.ofNullable(Utilities.getEnv("GOOGLE_PROJECT", "GOOGLE_CLOUD_PROJECT", "GCLOUD_PROJECT", "CLOUDSDK_CORE_PROJECT").orElse(null)) : project;
        this.region = region == null ? Input.ofNullable(Utilities.getEnv("GOOGLE_REGION", "GCLOUD_REGION", "CLOUDSDK_COMPUTE_REGION").orElse(null)) : region;
        this.zone = zone == null ? Input.ofNullable(Utilities.getEnv("GOOGLE_ZONE", "GCLOUD_ZONE", "CLOUDSDK_COMPUTE_ZONE").orElse(null)) : zone;
    }

    private ProviderArgs() {
        this.appendUserAgent = Input.empty();
        this.disablePartnerName = Input.empty();
        this.partnerName = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appendUserAgent;
        private @Nullable Input<Boolean> disablePartnerName;
        private @Nullable Input<String> partnerName;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appendUserAgent = defaults.appendUserAgent;
    	      this.disablePartnerName = defaults.disablePartnerName;
    	      this.partnerName = defaults.partnerName;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.zone = defaults.zone;
        }

        public Builder setAppendUserAgent(@Nullable Input<String> appendUserAgent) {
            this.appendUserAgent = appendUserAgent;
            return this;
        }

        public Builder setAppendUserAgent(@Nullable String appendUserAgent) {
            this.appendUserAgent = Input.ofNullable(appendUserAgent);
            return this;
        }

        public Builder setDisablePartnerName(@Nullable Input<Boolean> disablePartnerName) {
            this.disablePartnerName = disablePartnerName;
            return this;
        }

        public Builder setDisablePartnerName(@Nullable Boolean disablePartnerName) {
            this.disablePartnerName = Input.ofNullable(disablePartnerName);
            return this;
        }

        public Builder setPartnerName(@Nullable Input<String> partnerName) {
            this.partnerName = partnerName;
            return this;
        }

        public Builder setPartnerName(@Nullable String partnerName) {
            this.partnerName = Input.ofNullable(partnerName);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public ProviderArgs build() {
            return new ProviderArgs(appendUserAgent, disablePartnerName, partnerName, project, region, zone);
        }
    }
}
