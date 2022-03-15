// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayIamPolicyArgs Empty = new GatewayIamPolicyArgs();

    @Import(name="gateway", required=true)
      private final Output<String> gateway;

    public Output<String> getGateway() {
        return this.gateway;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region of the gateway for the API.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    public GatewayIamPolicyArgs(
        Output<String> gateway,
        Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.gateway = Objects.requireNonNull(gateway, "expected parameter 'gateway' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.region = region;
    }

    private GatewayIamPolicyArgs() {
        this.gateway = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> gateway;
        private Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gateway = defaults.gateway;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder gateway(Output<String> gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }

        public Builder gateway(String gateway) {
            this.gateway = Output.of(Objects.requireNonNull(gateway));
            return this;
        }

        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public GatewayIamPolicyArgs build() {
            return new GatewayIamPolicyArgs(gateway, policyData, project, region);
        }
    }
}
