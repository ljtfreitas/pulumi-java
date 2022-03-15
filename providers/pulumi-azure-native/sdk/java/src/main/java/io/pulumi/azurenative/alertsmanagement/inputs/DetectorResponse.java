// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The detector information. By default this is not populated, unless it's specified in expandDetector
 * 
 */
public final class DetectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final DetectorResponse Empty = new DetectorResponse();

    /**
     * The Smart Detector description. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The detector id.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The Smart Detector image path. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="imagePaths")
      private final @Nullable List<String> imagePaths;

    public List<String> getImagePaths() {
        return this.imagePaths == null ? List.of() : this.imagePaths;
    }

    /**
     * The Smart Detector name. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The detector's parameters.'
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,Object> parameters;

    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The Smart Detector supported resource types. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="supportedResourceTypes")
      private final @Nullable List<String> supportedResourceTypes;

    public List<String> getSupportedResourceTypes() {
        return this.supportedResourceTypes == null ? List.of() : this.supportedResourceTypes;
    }

    public DetectorResponse(
        @Nullable String description,
        String id,
        @Nullable List<String> imagePaths,
        @Nullable String name,
        @Nullable Map<String,Object> parameters,
        @Nullable List<String> supportedResourceTypes) {
        this.description = description;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.imagePaths = imagePaths;
        this.name = name;
        this.parameters = parameters;
        this.supportedResourceTypes = supportedResourceTypes;
    }

    private DetectorResponse() {
        this.description = null;
        this.id = null;
        this.imagePaths = List.of();
        this.name = null;
        this.parameters = Map.of();
        this.supportedResourceTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String id;
        private @Nullable List<String> imagePaths;
        private @Nullable String name;
        private @Nullable Map<String,Object> parameters;
        private @Nullable List<String> supportedResourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.imagePaths = defaults.imagePaths;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.supportedResourceTypes = defaults.supportedResourceTypes;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder imagePaths(@Nullable List<String> imagePaths) {
            this.imagePaths = imagePaths;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder supportedResourceTypes(@Nullable List<String> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public DetectorResponse build() {
            return new DetectorResponse(description, id, imagePaths, name, parameters, supportedResourceTypes);
        }
    }
}
