// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHl7V2StoreArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHl7V2StoreArgs Empty = new GetHl7V2StoreArgs();

    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @Import(name="hl7V2StoreId", required=true)
      private final String hl7V2StoreId;

    public String getHl7V2StoreId() {
        return this.hl7V2StoreId;
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

    public GetHl7V2StoreArgs(
        String datasetId,
        String hl7V2StoreId,
        String location,
        @Nullable String project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetHl7V2StoreArgs() {
        this.datasetId = null;
        this.hl7V2StoreId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHl7V2StoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String hl7V2StoreId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHl7V2StoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder hl7V2StoreId(String hl7V2StoreId) {
            this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId);
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
        public GetHl7V2StoreArgs build() {
            return new GetHl7V2StoreArgs(datasetId, hl7V2StoreId, location, project);
        }
    }
}
