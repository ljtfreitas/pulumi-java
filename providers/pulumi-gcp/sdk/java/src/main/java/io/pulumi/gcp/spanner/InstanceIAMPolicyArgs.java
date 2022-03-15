// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceIAMPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceIAMPolicyArgs Empty = new InstanceIAMPolicyArgs();

    /**
     * The name of the instance.
     * 
     */
    @Import(name="instance", required=true)
      private final Output<String> instance;

    public Output<String> getInstance() {
        return this.instance;
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
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public InstanceIAMPolicyArgs(
        Output<String> instance,
        Output<String> policyData,
        @Nullable Output<String> project) {
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private InstanceIAMPolicyArgs() {
        this.instance = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instance;
        private Output<String> policyData;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceIAMPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder instance(Output<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Output.of(Objects.requireNonNull(instance));
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
        public InstanceIAMPolicyArgs build() {
            return new InstanceIAMPolicyArgs(instance, policyData, project);
        }
    }
}
