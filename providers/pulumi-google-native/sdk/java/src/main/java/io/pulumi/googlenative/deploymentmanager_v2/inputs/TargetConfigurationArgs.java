// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2.inputs.ConfigFileArgs;
import io.pulumi.googlenative.deploymentmanager_v2.inputs.ImportFileArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetConfigurationArgs Empty = new TargetConfigurationArgs();

    /**
     * The configuration to use for this deployment.
     * 
     */
    @InputImport(name="config")
      private final @Nullable Input<ConfigFileArgs> config;

    public Input<ConfigFileArgs> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    @InputImport(name="imports")
      private final @Nullable Input<List<ImportFileArgs>> imports;

    public Input<List<ImportFileArgs>> getImports() {
        return this.imports == null ? Input.empty() : this.imports;
    }

    public TargetConfigurationArgs(
        @Nullable Input<ConfigFileArgs> config,
        @Nullable Input<List<ImportFileArgs>> imports) {
        this.config = config;
        this.imports = imports;
    }

    private TargetConfigurationArgs() {
        this.config = Input.empty();
        this.imports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigFileArgs> config;
        private @Nullable Input<List<ImportFileArgs>> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder setConfig(@Nullable Input<ConfigFileArgs> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable ConfigFileArgs config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setImports(@Nullable Input<List<ImportFileArgs>> imports) {
            this.imports = imports;
            return this;
        }

        public Builder setImports(@Nullable List<ImportFileArgs> imports) {
            this.imports = Input.ofNullable(imports);
            return this;
        }
        public TargetConfigurationArgs build() {
            return new TargetConfigurationArgs(config, imports);
        }
    }
}
