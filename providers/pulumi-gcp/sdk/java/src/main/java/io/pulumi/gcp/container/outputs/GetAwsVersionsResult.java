// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAwsVersionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String location;
    private final @Nullable String project;
    /**
     * A list of AWS regions that are available for use with this project and GCP location.
     * 
     */
    private final List<String> supportedRegions;
    /**
     * A list of versions available for use with this project and location.
     * 
     */
    private final List<String> validVersions;

    @OutputCustomType.Constructor({"id","location","project","supportedRegions","validVersions"})
    private GetAwsVersionsResult(
        String id,
        @Nullable String location,
        @Nullable String project,
        List<String> supportedRegions,
        List<String> validVersions) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.project = project;
        this.supportedRegions = Objects.requireNonNull(supportedRegions);
        this.validVersions = Objects.requireNonNull(validVersions);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    /**
     * A list of AWS regions that are available for use with this project and GCP location.
     * 
     */
    public List<String> getSupportedRegions() {
        return this.supportedRegions;
    }
    /**
     * A list of versions available for use with this project and location.
     * 
     */
    public List<String> getValidVersions() {
        return this.validVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsVersionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private @Nullable String project;
        private List<String> supportedRegions;
        private List<String> validVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAwsVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.supportedRegions = defaults.supportedRegions;
    	      this.validVersions = defaults.validVersions;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSupportedRegions(List<String> supportedRegions) {
            this.supportedRegions = Objects.requireNonNull(supportedRegions);
            return this;
        }

        public Builder setValidVersions(List<String> validVersions) {
            this.validVersions = Objects.requireNonNull(validVersions);
            return this;
        }
        public GetAwsVersionsResult build() {
            return new GetAwsVersionsResult(id, location, project, supportedRegions, validVersions);
        }
    }
}
