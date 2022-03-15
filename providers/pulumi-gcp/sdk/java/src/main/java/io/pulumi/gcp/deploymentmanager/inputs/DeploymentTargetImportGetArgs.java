// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.deploymentmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentTargetImportGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentTargetImportGetArgs Empty = new DeploymentTargetImportGetArgs();

    /**
     * The full contents of the template that you want to import.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    /**
     * The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public DeploymentTargetImportGetArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> name) {
        this.content = content;
        this.name = name;
    }

    private DeploymentTargetImportGetArgs() {
        this.content = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentTargetImportGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentTargetImportGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.name = defaults.name;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
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
        public DeploymentTargetImportGetArgs build() {
            return new DeploymentTargetImportGetArgs(content, name);
        }
    }
}
