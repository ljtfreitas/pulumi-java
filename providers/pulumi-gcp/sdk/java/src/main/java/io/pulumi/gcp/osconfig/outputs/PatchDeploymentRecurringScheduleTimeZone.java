// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PatchDeploymentRecurringScheduleTimeZone {
    /**
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * 
     */
    private final String id;
    /**
     * IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"id","version"})
    private PatchDeploymentRecurringScheduleTimeZone(
        String id,
        @Nullable String version) {
        this.id = Objects.requireNonNull(id);
        this.version = version;
    }

    /**
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleTimeZone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleTimeZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public PatchDeploymentRecurringScheduleTimeZone build() {
            return new PatchDeploymentRecurringScheduleTimeZone(id, version);
        }
    }
}
