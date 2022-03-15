// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvgroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvgroupArgs Empty = new EnvgroupArgs();

    /**
     * Host names for this environment group.
     * 
     */
    @Import(name="hostnames", required=true)
      private final Output<List<String>> hostnames;

    public Output<List<String>> getHostnames() {
        return this.hostnames;
    }

    /**
     * ID of the environment group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    public EnvgroupArgs(
        Output<List<String>> hostnames,
        @Nullable Output<String> name,
        Output<String> organizationId) {
        this.hostnames = Objects.requireNonNull(hostnames, "expected parameter 'hostnames' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private EnvgroupArgs() {
        this.hostnames = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvgroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> hostnames;
        private @Nullable Output<String> name;
        private Output<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvgroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder hostnames(Output<List<String>> hostnames) {
            this.hostnames = Objects.requireNonNull(hostnames);
            return this;
        }

        public Builder hostnames(List<String> hostnames) {
            this.hostnames = Output.of(Objects.requireNonNull(hostnames));
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

        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public EnvgroupArgs build() {
            return new EnvgroupArgs(hostnames, name, organizationId);
        }
    }
}
