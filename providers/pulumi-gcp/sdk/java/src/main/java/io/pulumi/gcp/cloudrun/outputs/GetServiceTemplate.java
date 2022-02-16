// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateMetadata;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpec;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServiceTemplate {
    private final List<GetServiceTemplateMetadata> metadatas;
    private final List<GetServiceTemplateSpec> specs;

    @OutputCustomType.Constructor({"metadatas","specs"})
    private GetServiceTemplate(
        List<GetServiceTemplateMetadata> metadatas,
        List<GetServiceTemplateSpec> specs) {
        this.metadatas = Objects.requireNonNull(metadatas);
        this.specs = Objects.requireNonNull(specs);
    }

    public List<GetServiceTemplateMetadata> getMetadatas() {
        return this.metadatas;
    }
    public List<GetServiceTemplateSpec> getSpecs() {
        return this.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceTemplateMetadata> metadatas;
        private List<GetServiceTemplateSpec> specs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadatas = defaults.metadatas;
    	      this.specs = defaults.specs;
        }

        public Builder setMetadatas(List<GetServiceTemplateMetadata> metadatas) {
            this.metadatas = Objects.requireNonNull(metadatas);
            return this;
        }

        public Builder setSpecs(List<GetServiceTemplateSpec> specs) {
            this.specs = Objects.requireNonNull(specs);
            return this;
        }

        public GetServiceTemplate build() {
            return new GetServiceTemplate(metadatas, specs);
        }
    }
}