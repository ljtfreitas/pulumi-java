// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification for an App Service Environment to use for this resource.
 * 
 */
public final class HostingEnvironmentProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostingEnvironmentProfileArgs Empty = new HostingEnvironmentProfileArgs();

    /**
     * Resource ID of the App Service Environment.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    public HostingEnvironmentProfileArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private HostingEnvironmentProfileArgs() {
        this.id = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostingEnvironmentProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(HostingEnvironmentProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public HostingEnvironmentProfileArgs build() {
            return new HostingEnvironmentProfileArgs(id);
        }
    }
}
