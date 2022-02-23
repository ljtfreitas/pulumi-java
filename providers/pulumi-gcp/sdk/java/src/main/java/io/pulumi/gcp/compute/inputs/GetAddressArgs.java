// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAddressArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAddressArgs Empty = new GetAddressArgs();

    /**
     * A unique name for the resource, required by GCE.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The Region in which the created address reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
        private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    public GetAddressArgs(
        String name,
        @Nullable String project,
        @Nullable String region) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
        this.region = region;
    }

    private GetAddressArgs() {
        this.name = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String project;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }
        public GetAddressArgs build() {
            return new GetAddressArgs(name, project, region);
        }
    }
}
