// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupLaunchTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupLaunchTemplateGetArgs Empty = new NodeGroupLaunchTemplateGetArgs();

    /**
     * Identifier of the EC2 Launch Template. Conflicts with `name`.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g. `1`) on read and This provider will show a difference on next plan. Using the `default_version` or `latest_version` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public NodeGroupLaunchTemplateGetArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        Output<String> version) {
        this.id = id;
        this.name = name;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private NodeGroupLaunchTemplateGetArgs() {
        this.id = Output.empty();
        this.name = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupLaunchTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupLaunchTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
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

        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }
        public NodeGroupLaunchTemplateGetArgs build() {
            return new NodeGroupLaunchTemplateGetArgs(id, name, version);
        }
    }
}
