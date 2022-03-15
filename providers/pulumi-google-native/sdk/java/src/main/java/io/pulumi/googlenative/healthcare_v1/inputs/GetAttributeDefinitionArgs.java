// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAttributeDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAttributeDefinitionArgs Empty = new GetAttributeDefinitionArgs();

    @Import(name="attributeDefinitionId", required=true)
      private final String attributeDefinitionId;

    public String getAttributeDefinitionId() {
        return this.attributeDefinitionId;
    }

    @Import(name="consentStoreId", required=true)
      private final String consentStoreId;

    public String getConsentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAttributeDefinitionArgs(
        String attributeDefinitionId,
        String consentStoreId,
        String datasetId,
        String location,
        @Nullable String project) {
        this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId, "expected parameter 'attributeDefinitionId' to be non-null");
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetAttributeDefinitionArgs() {
        this.attributeDefinitionId = null;
        this.consentStoreId = null;
        this.datasetId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttributeDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeDefinitionId;
        private String consentStoreId;
        private String datasetId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttributeDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeDefinitionId = defaults.attributeDefinitionId;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder attributeDefinitionId(String attributeDefinitionId) {
            this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId);
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetAttributeDefinitionArgs build() {
            return new GetAttributeDefinitionArgs(attributeDefinitionId, consentStoreId, datasetId, location, project);
        }
    }
}
