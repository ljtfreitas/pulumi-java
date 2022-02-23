// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAddressArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAddressArgs Empty = new GetAddressArgs();

    @InputImport(name="address", required=true)
      private final String address;

    public String getAddress() {
        return this.address;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetAddressArgs(
        String address,
        @Nullable String project,
        String region) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetAddressArgs() {
        this.address = null;
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
        private String address;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetAddressArgs build() {
            return new GetAddressArgs(address, project, region);
        }
    }
}
