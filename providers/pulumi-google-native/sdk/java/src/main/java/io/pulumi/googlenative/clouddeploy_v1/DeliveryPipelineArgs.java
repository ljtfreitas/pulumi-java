// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.clouddeploy_v1.inputs.SerialPipelineArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryPipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineArgs Empty = new DeliveryPipelineArgs();

    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="deliveryPipelineId", required=true)
      private final Input<String> deliveryPipelineId;

    public Input<String> getDeliveryPipelineId() {
        return this.deliveryPipelineId;
    }

    /**
     * Description of the `DeliveryPipeline`. Max length is 255 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * 
     */
    @InputImport(name="serialPipeline")
      private final @Nullable Input<SerialPipelineArgs> serialPipeline;

    public Input<SerialPipelineArgs> getSerialPipeline() {
        return this.serialPipeline == null ? Input.empty() : this.serialPipeline;
    }

    @InputImport(name="validateOnly")
      private final @Nullable Input<String> validateOnly;

    public Input<String> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    public DeliveryPipelineArgs(
        @Nullable Input<Map<String,String>> annotations,
        Input<String> deliveryPipelineId,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<SerialPipelineArgs> serialPipeline,
        @Nullable Input<String> validateOnly) {
        this.annotations = annotations;
        this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId, "expected parameter 'deliveryPipelineId' to be non-null");
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.serialPipeline = serialPipeline;
        this.validateOnly = validateOnly;
    }

    private DeliveryPipelineArgs() {
        this.annotations = Input.empty();
        this.deliveryPipelineId = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.serialPipeline = Input.empty();
        this.validateOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private Input<String> deliveryPipelineId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<SerialPipelineArgs> serialPipeline;
        private @Nullable Input<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.deliveryPipelineId = defaults.deliveryPipelineId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.serialPipeline = defaults.serialPipeline;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setDeliveryPipelineId(Input<String> deliveryPipelineId) {
            this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId);
            return this;
        }

        public Builder setDeliveryPipelineId(String deliveryPipelineId) {
            this.deliveryPipelineId = Input.of(Objects.requireNonNull(deliveryPipelineId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSerialPipeline(@Nullable Input<SerialPipelineArgs> serialPipeline) {
            this.serialPipeline = serialPipeline;
            return this;
        }

        public Builder setSerialPipeline(@Nullable SerialPipelineArgs serialPipeline) {
            this.serialPipeline = Input.ofNullable(serialPipeline);
            return this;
        }

        public Builder setValidateOnly(@Nullable Input<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder setValidateOnly(@Nullable String validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }
        public DeliveryPipelineArgs build() {
            return new DeliveryPipelineArgs(annotations, deliveryPipelineId, description, etag, labels, location, name, project, requestId, serialPipeline, validateOnly);
        }
    }
}
