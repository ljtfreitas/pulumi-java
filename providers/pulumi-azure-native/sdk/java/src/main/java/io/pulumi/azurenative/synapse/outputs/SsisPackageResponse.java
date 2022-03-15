// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.SsisParameterResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SsisPackageResponse {
    /**
     * Metadata description.
     * 
     */
    private final @Nullable String description;
    /**
     * Folder id which contains package.
     * 
     */
    private final @Nullable Double folderId;
    /**
     * Metadata id.
     * 
     */
    private final @Nullable Double id;
    /**
     * Metadata name.
     * 
     */
    private final @Nullable String name;
    /**
     * Parameters in package
     * 
     */
    private final @Nullable List<SsisParameterResponse> parameters;
    /**
     * Project id which contains package.
     * 
     */
    private final @Nullable Double projectId;
    /**
     * Project version which contains package.
     * 
     */
    private final @Nullable Double projectVersion;
    /**
     * The type of SSIS object metadata.
     * Expected value is 'Package'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SsisPackageResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("folderId") @Nullable Double folderId,
        @CustomType.Parameter("id") @Nullable Double id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("parameters") @Nullable List<SsisParameterResponse> parameters,
        @CustomType.Parameter("projectId") @Nullable Double projectId,
        @CustomType.Parameter("projectVersion") @Nullable Double projectVersion,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.folderId = folderId;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.projectId = projectId;
        this.projectVersion = projectVersion;
        this.type = type;
    }

    /**
     * Metadata description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Folder id which contains package.
     * 
    */
    public Optional<Double> getFolderId() {
        return Optional.ofNullable(this.folderId);
    }
    /**
     * Metadata id.
     * 
    */
    public Optional<Double> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Metadata name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Parameters in package
     * 
    */
    public List<SsisParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * Project id which contains package.
     * 
    */
    public Optional<Double> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * Project version which contains package.
     * 
    */
    public Optional<Double> getProjectVersion() {
        return Optional.ofNullable(this.projectVersion);
    }
    /**
     * The type of SSIS object metadata.
     * Expected value is 'Package'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Double folderId;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable List<SsisParameterResponse> parameters;
        private @Nullable Double projectId;
        private @Nullable Double projectVersion;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.projectId = defaults.projectId;
    	      this.projectVersion = defaults.projectVersion;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder folderId(@Nullable Double folderId) {
            this.folderId = folderId;
            return this;
        }

        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder parameters(@Nullable List<SsisParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder projectId(@Nullable Double projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder projectVersion(@Nullable Double projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SsisPackageResponse build() {
            return new SsisPackageResponse(description, folderId, id, name, parameters, projectId, projectVersion, type);
        }
    }
}
