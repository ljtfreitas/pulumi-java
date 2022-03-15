// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.ConfigFileArgs;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.ImportFileArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetConfigurationArgs Empty = new TargetConfigurationArgs();

    /**
     * The configuration to use for this deployment.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<ConfigFileArgs> config;

    public Output<ConfigFileArgs> getConfig() {
        return this.config == null ? Output.empty() : this.config;
    }

    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    @Import(name="imports")
      private final @Nullable Output<List<ImportFileArgs>> imports;

    public Output<List<ImportFileArgs>> getImports() {
        return this.imports == null ? Output.empty() : this.imports;
    }

    public TargetConfigurationArgs(
        @Nullable Output<ConfigFileArgs> config,
        @Nullable Output<List<ImportFileArgs>> imports) {
        this.config = config;
        this.imports = imports;
    }

    private TargetConfigurationArgs() {
        this.config = Output.empty();
        this.imports = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigFileArgs> config;
        private @Nullable Output<List<ImportFileArgs>> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder config(@Nullable Output<ConfigFileArgs> config) {
            this.config = config;
            return this;
        }

        public Builder config(@Nullable ConfigFileArgs config) {
            this.config = Output.ofNullable(config);
            return this;
        }

        public Builder imports(@Nullable Output<List<ImportFileArgs>> imports) {
            this.imports = imports;
            return this;
        }

        public Builder imports(@Nullable List<ImportFileArgs> imports) {
            this.imports = Output.ofNullable(imports);
            return this;
        }
        public TargetConfigurationArgs build() {
            return new TargetConfigurationArgs(config, imports);
        }
    }
}
