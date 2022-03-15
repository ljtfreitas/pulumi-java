// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a render farm that is associated with a studio resource.</p>
 * 
 */
public final class StudioComponentComputeFarmConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final StudioComponentComputeFarmConfiguration Empty = new StudioComponentComputeFarmConfiguration();

    /**
     * <p>The name of an Active Directory user that is used on ComputeFarm worker instances.</p>
     * 
     */
    @Import(name="activeDirectoryUser")
      private final @Nullable String activeDirectoryUser;

    public Optional<String> getActiveDirectoryUser() {
        return this.activeDirectoryUser == null ? Optional.empty() : Optional.ofNullable(this.activeDirectoryUser);
    }

    /**
     * <p>The endpoint of the ComputeFarm that is accessed by the studio component resource.</p>
     * 
     */
    @Import(name="endpoint")
      private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    public StudioComponentComputeFarmConfiguration(
        @Nullable String activeDirectoryUser,
        @Nullable String endpoint) {
        this.activeDirectoryUser = activeDirectoryUser;
        this.endpoint = endpoint;
    }

    private StudioComponentComputeFarmConfiguration() {
        this.activeDirectoryUser = null;
        this.endpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentComputeFarmConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeDirectoryUser;
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentComputeFarmConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryUser = defaults.activeDirectoryUser;
    	      this.endpoint = defaults.endpoint;
        }

        public Builder activeDirectoryUser(@Nullable String activeDirectoryUser) {
            this.activeDirectoryUser = activeDirectoryUser;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public StudioComponentComputeFarmConfiguration build() {
            return new StudioComponentComputeFarmConfiguration(activeDirectoryUser, endpoint);
        }
    }
}
