// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.awsnative.route53.outputs.HostedZoneConfig;
import io.pulumi.awsnative.route53.outputs.HostedZoneQueryLoggingConfig;
import io.pulumi.awsnative.route53.outputs.HostedZoneTag;
import io.pulumi.awsnative.route53.outputs.HostedZoneVPC;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHostedZoneResult {
    private final @Nullable HostedZoneConfig hostedZoneConfig;
    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * 
     * For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
     * 
     */
    private final @Nullable List<HostedZoneTag> hostedZoneTags;
    private final @Nullable String id;
    private final @Nullable List<String> nameServers;
    private final @Nullable HostedZoneQueryLoggingConfig queryLoggingConfig;
    /**
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * 
     */
    private final @Nullable List<HostedZoneVPC> vPCs;

    @OutputCustomType.Constructor({"hostedZoneConfig","hostedZoneTags","id","nameServers","queryLoggingConfig","vPCs"})
    private GetHostedZoneResult(
        @Nullable HostedZoneConfig hostedZoneConfig,
        @Nullable List<HostedZoneTag> hostedZoneTags,
        @Nullable String id,
        @Nullable List<String> nameServers,
        @Nullable HostedZoneQueryLoggingConfig queryLoggingConfig,
        @Nullable List<HostedZoneVPC> vPCs) {
        this.hostedZoneConfig = hostedZoneConfig;
        this.hostedZoneTags = hostedZoneTags;
        this.id = id;
        this.nameServers = nameServers;
        this.queryLoggingConfig = queryLoggingConfig;
        this.vPCs = vPCs;
    }

    public Optional<HostedZoneConfig> getHostedZoneConfig() {
        return Optional.ofNullable(this.hostedZoneConfig);
    }
    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * 
     * For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
     * 
     */
    public List<HostedZoneTag> getHostedZoneTags() {
        return this.hostedZoneTags == null ? List.of() : this.hostedZoneTags;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<String> getNameServers() {
        return this.nameServers == null ? List.of() : this.nameServers;
    }
    public Optional<HostedZoneQueryLoggingConfig> getQueryLoggingConfig() {
        return Optional.ofNullable(this.queryLoggingConfig);
    }
    /**
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * 
     */
    public List<HostedZoneVPC> getVPCs() {
        return this.vPCs == null ? List.of() : this.vPCs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostedZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HostedZoneConfig hostedZoneConfig;
        private @Nullable List<HostedZoneTag> hostedZoneTags;
        private @Nullable String id;
        private @Nullable List<String> nameServers;
        private @Nullable HostedZoneQueryLoggingConfig queryLoggingConfig;
        private @Nullable List<HostedZoneVPC> vPCs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostedZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneConfig = defaults.hostedZoneConfig;
    	      this.hostedZoneTags = defaults.hostedZoneTags;
    	      this.id = defaults.id;
    	      this.nameServers = defaults.nameServers;
    	      this.queryLoggingConfig = defaults.queryLoggingConfig;
    	      this.vPCs = defaults.vPCs;
        }

        public Builder setHostedZoneConfig(@Nullable HostedZoneConfig hostedZoneConfig) {
            this.hostedZoneConfig = hostedZoneConfig;
            return this;
        }

        public Builder setHostedZoneTags(@Nullable List<HostedZoneTag> hostedZoneTags) {
            this.hostedZoneTags = hostedZoneTags;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setNameServers(@Nullable List<String> nameServers) {
            this.nameServers = nameServers;
            return this;
        }

        public Builder setQueryLoggingConfig(@Nullable HostedZoneQueryLoggingConfig queryLoggingConfig) {
            this.queryLoggingConfig = queryLoggingConfig;
            return this;
        }

        public Builder setVPCs(@Nullable List<HostedZoneVPC> vPCs) {
            this.vPCs = vPCs;
            return this;
        }
        public GetHostedZoneResult build() {
            return new GetHostedZoneResult(hostedZoneConfig, hostedZoneTags, id, nameServers, queryLoggingConfig, vPCs);
        }
    }
}
