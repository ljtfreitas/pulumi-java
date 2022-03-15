// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.ConfigFileResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.ImportFileResponse;
import java.util.List;
import java.util.Objects;


public final class TargetConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetConfigurationResponse Empty = new TargetConfigurationResponse();

    /**
     * The configuration to use for this deployment.
     * 
     */
    @Import(name="config", required=true)
      private final ConfigFileResponse config;

    public ConfigFileResponse getConfig() {
        return this.config;
    }

    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    @Import(name="imports", required=true)
      private final List<ImportFileResponse> imports;

    public List<ImportFileResponse> getImports() {
        return this.imports;
    }

    public TargetConfigurationResponse(
        ConfigFileResponse config,
        List<ImportFileResponse> imports) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.imports = Objects.requireNonNull(imports, "expected parameter 'imports' to be non-null");
    }

    private TargetConfigurationResponse() {
        this.config = null;
        this.imports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigFileResponse config;
        private List<ImportFileResponse> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder config(ConfigFileResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder imports(List<ImportFileResponse> imports) {
            this.imports = Objects.requireNonNull(imports);
            return this;
        }
        public TargetConfigurationResponse build() {
            return new TargetConfigurationResponse(config, imports);
        }
    }
}
