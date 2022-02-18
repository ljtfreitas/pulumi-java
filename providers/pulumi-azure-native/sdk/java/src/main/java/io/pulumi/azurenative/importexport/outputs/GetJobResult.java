// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.outputs;

import io.pulumi.azurenative.importexport.outputs.IdentityDetailsResponse;
import io.pulumi.azurenative.importexport.outputs.JobDetailsResponse;
import io.pulumi.azurenative.importexport.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobResult {
    /**
     * Specifies the resource identifier of the job.
     * 
     */
    private final String id;
    /**
     * Specifies the job identity details
     * 
     */
    private final @Nullable IdentityDetailsResponse identity;
    /**
     * Specifies the Azure location where the job is created.
     * 
     */
    private final @Nullable String location;
    /**
     * Specifies the name of the job.
     * 
     */
    private final String name;
    /**
     * Specifies the job properties
     * 
     */
    private final JobDetailsResponse properties;
    /**
     * SystemData of ImportExport Jobs.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Specifies the tags that are assigned to the job.
     * 
     */
    private final @Nullable Object tags;
    /**
     * Specifies the type of the job resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","properties","systemData","tags","type"})
    private GetJobResult(
        String id,
        @Nullable IdentityDetailsResponse identity,
        @Nullable String location,
        String name,
        JobDetailsResponse properties,
        SystemDataResponse systemData,
        @Nullable Object tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the resource identifier of the job.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the job identity details
     * 
     */
    public Optional<IdentityDetailsResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Specifies the Azure location where the job is created.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Specifies the name of the job.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the job properties
     * 
     */
    public JobDetailsResponse getProperties() {
        return this.properties;
    }
    /**
     * SystemData of ImportExport Jobs.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Specifies the tags that are assigned to the job.
     * 
     */
    public Optional<Object> getTags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * Specifies the type of the job resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityDetailsResponse identity;
        private @Nullable String location;
        private String name;
        private JobDetailsResponse properties;
        private SystemDataResponse systemData;
        private @Nullable Object tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityDetailsResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(JobDetailsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetJobResult build() {
            return new GetJobResult(id, identity, location, name, properties, systemData, tags, type);
        }
    }
}
