// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Preferred location. This specifies where a Cloud SQL instance is located. Note that if the preferred location is not available, the instance will be located as close as possible within the region. Only one location may be specified.
 * 
 */
public final class LocationPreferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationPreferenceArgs Empty = new LocationPreferenceArgs();

    /**
     * The App Engine application to follow, it must be in the same region as the Cloud SQL instance. WARNING: Changing this might restart the instance.
     * 
     */
    @InputImport(name="followGaeApplication")
      private final @Nullable Input<String> followGaeApplication;

    public Input<String> getFollowGaeApplication() {
        return this.followGaeApplication == null ? Input.empty() : this.followGaeApplication;
    }

    /**
     * This is always `sql#locationPreference`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-central1-b, etc.). Reserved for future use.
     * 
     */
    @InputImport(name="secondaryZone")
      private final @Nullable Input<String> secondaryZone;

    public Input<String> getSecondaryZone() {
        return this.secondaryZone == null ? Input.empty() : this.secondaryZone;
    }

    /**
     * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.). WARNING: Changing this might restart the instance.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public LocationPreferenceArgs(
        @Nullable Input<String> followGaeApplication,
        @Nullable Input<String> kind,
        @Nullable Input<String> secondaryZone,
        @Nullable Input<String> zone) {
        this.followGaeApplication = followGaeApplication;
        this.kind = kind;
        this.secondaryZone = secondaryZone;
        this.zone = zone;
    }

    private LocationPreferenceArgs() {
        this.followGaeApplication = Input.empty();
        this.kind = Input.empty();
        this.secondaryZone = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> followGaeApplication;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> secondaryZone;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationPreferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followGaeApplication = defaults.followGaeApplication;
    	      this.kind = defaults.kind;
    	      this.secondaryZone = defaults.secondaryZone;
    	      this.zone = defaults.zone;
        }

        public Builder setFollowGaeApplication(@Nullable Input<String> followGaeApplication) {
            this.followGaeApplication = followGaeApplication;
            return this;
        }

        public Builder setFollowGaeApplication(@Nullable String followGaeApplication) {
            this.followGaeApplication = Input.ofNullable(followGaeApplication);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setSecondaryZone(@Nullable Input<String> secondaryZone) {
            this.secondaryZone = secondaryZone;
            return this;
        }

        public Builder setSecondaryZone(@Nullable String secondaryZone) {
            this.secondaryZone = Input.ofNullable(secondaryZone);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public LocationPreferenceArgs build() {
            return new LocationPreferenceArgs(followGaeApplication, kind, secondaryZone, zone);
        }
    }
}
