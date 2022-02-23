// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.inputs;

import io.pulumi.azurenative.devops.inputs.CodeRepositoryArgs;
import io.pulumi.azurenative.devops.inputs.PipelineTemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration used to bootstrap a Pipeline.
 * 
 */
public final class BootstrapConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BootstrapConfigurationArgs Empty = new BootstrapConfigurationArgs();

    /**
     * Repository containing the source code for the pipeline. Currently only 'azurePipeline' pipeline type supports this.
     * 
     */
    @InputImport(name="sourceRepository")
        private final @Nullable Input<CodeRepositoryArgs> sourceRepository;

    public Input<CodeRepositoryArgs> getSourceRepository() {
        return this.sourceRepository == null ? Input.empty() : this.sourceRepository;
    }

    /**
     * Template used to bootstrap the pipeline.
     * 
     */
    @InputImport(name="template", required=true)
        private final Input<PipelineTemplateArgs> template;

    public Input<PipelineTemplateArgs> getTemplate() {
        return this.template;
    }

    public BootstrapConfigurationArgs(
        @Nullable Input<CodeRepositoryArgs> sourceRepository,
        Input<PipelineTemplateArgs> template) {
        this.sourceRepository = sourceRepository;
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private BootstrapConfigurationArgs() {
        this.sourceRepository = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootstrapConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CodeRepositoryArgs> sourceRepository;
        private Input<PipelineTemplateArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(BootstrapConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.template = defaults.template;
        }

        public Builder setSourceRepository(@Nullable Input<CodeRepositoryArgs> sourceRepository) {
            this.sourceRepository = sourceRepository;
            return this;
        }

        public Builder setSourceRepository(@Nullable CodeRepositoryArgs sourceRepository) {
            this.sourceRepository = Input.ofNullable(sourceRepository);
            return this;
        }

        public Builder setTemplate(Input<PipelineTemplateArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTemplate(PipelineTemplateArgs template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }
        public BootstrapConfigurationArgs build() {
            return new BootstrapConfigurationArgs(sourceRepository, template);
        }
    }
}
