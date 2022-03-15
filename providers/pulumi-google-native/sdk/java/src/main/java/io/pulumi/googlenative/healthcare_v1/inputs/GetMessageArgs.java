// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMessageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMessageArgs Empty = new GetMessageArgs();

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

    @Import(name="messageId", required=true)
      private final String messageId;

    public String getMessageId() {
        return this.messageId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="view")
      private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetMessageArgs(
        String datasetId,
        String hl7V2StoreId,
        String location,
        String messageId,
        @Nullable String project,
        @Nullable String view) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.project = project;
        this.view = view;
    }

    private GetMessageArgs() {
        this.datasetId = null;
        this.hl7V2StoreId = null;
        this.location = null;
        this.messageId = null;
        this.project = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String hl7V2StoreId;
        private String location;
        private String messageId;
        private @Nullable String project;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.location = defaults.location;
    	      this.messageId = defaults.messageId;
    	      this.project = defaults.project;
    	      this.view = defaults.view;
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

        public Builder messageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }
        public GetMessageArgs build() {
            return new GetMessageArgs(datasetId, hl7V2StoreId, location, messageId, project, view);
        }
    }
}
