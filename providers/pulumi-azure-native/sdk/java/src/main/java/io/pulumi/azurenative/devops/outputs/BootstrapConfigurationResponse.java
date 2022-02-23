// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.outputs;

import io.pulumi.azurenative.devops.outputs.CodeRepositoryResponse;
import io.pulumi.azurenative.devops.outputs.PipelineTemplateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BootstrapConfigurationResponse {
    /**
     * Repository containing the source code for the pipeline. Currently only 'azurePipeline' pipeline type supports this.
     * 
     */
    private final @Nullable CodeRepositoryResponse sourceRepository;
    /**
     * Template used to bootstrap the pipeline.
     * 
     */
    private final PipelineTemplateResponse template;

    @OutputCustomType.Constructor({"sourceRepository","template"})
    private BootstrapConfigurationResponse(
        @Nullable CodeRepositoryResponse sourceRepository,
        PipelineTemplateResponse template) {
        this.sourceRepository = sourceRepository;
        this.template = Objects.requireNonNull(template);
    }

    /**
     * Repository containing the source code for the pipeline. Currently only 'azurePipeline' pipeline type supports this.
     * 
     */
    public Optional<CodeRepositoryResponse> getSourceRepository() {
        return Optional.ofNullable(this.sourceRepository);
    }
    /**
     * Template used to bootstrap the pipeline.
     * 
     */
    public PipelineTemplateResponse getTemplate() {
        return this.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootstrapConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CodeRepositoryResponse sourceRepository;
        private PipelineTemplateResponse template;

        public Builder() {
    	      // Empty
        }

        public Builder(BootstrapConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.template = defaults.template;
        }

        public Builder setSourceRepository(@Nullable CodeRepositoryResponse sourceRepository) {
            this.sourceRepository = sourceRepository;
            return this;
        }

        public Builder setTemplate(PipelineTemplateResponse template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public BootstrapConfigurationResponse build() {
            return new BootstrapConfigurationResponse(sourceRepository, template);
        }
    }
}
