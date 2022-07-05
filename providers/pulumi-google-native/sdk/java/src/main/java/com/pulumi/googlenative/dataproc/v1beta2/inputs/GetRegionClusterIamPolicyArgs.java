// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionClusterIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionClusterIamPolicyArgs Empty = new GetRegionClusterIamPolicyArgs();

    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="regionId", required=true)
    private Output<String> regionId;

    public Output<String> regionId() {
        return this.regionId;
    }

    private GetRegionClusterIamPolicyArgs() {}

    private GetRegionClusterIamPolicyArgs(GetRegionClusterIamPolicyArgs $) {
        this.clusterId = $.clusterId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.regionId = $.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionClusterIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionClusterIamPolicyArgs $;

        public Builder() {
            $ = new GetRegionClusterIamPolicyArgs();
        }

        public Builder(GetRegionClusterIamPolicyArgs defaults) {
            $ = new GetRegionClusterIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder regionId(Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        public GetRegionClusterIamPolicyArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.regionId = Objects.requireNonNull($.regionId, "expected parameter 'regionId' to be non-null");
            return $;
        }
    }

}
