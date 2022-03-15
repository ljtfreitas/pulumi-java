// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInstanceSettingLocationPreference extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSettingLocationPreference Empty = new GetDatabaseInstanceSettingLocationPreference();

    @Import(name="followGaeApplication", required=true)
      private final String followGaeApplication;

    public String getFollowGaeApplication() {
        return this.followGaeApplication;
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetDatabaseInstanceSettingLocationPreference(
        String followGaeApplication,
        String zone) {
        this.followGaeApplication = Objects.requireNonNull(followGaeApplication, "expected parameter 'followGaeApplication' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetDatabaseInstanceSettingLocationPreference() {
        this.followGaeApplication = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingLocationPreference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String followGaeApplication;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingLocationPreference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followGaeApplication = defaults.followGaeApplication;
    	      this.zone = defaults.zone;
        }

        public Builder followGaeApplication(String followGaeApplication) {
            this.followGaeApplication = Objects.requireNonNull(followGaeApplication);
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetDatabaseInstanceSettingLocationPreference build() {
            return new GetDatabaseInstanceSettingLocationPreference(followGaeApplication, zone);
        }
    }
}
