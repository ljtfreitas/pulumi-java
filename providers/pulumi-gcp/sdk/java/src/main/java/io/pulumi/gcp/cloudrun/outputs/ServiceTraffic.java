// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTraffic {
    private final @Nullable Boolean latestRevision;
    private final Integer percent;
    private final @Nullable String revisionName;

    @OutputCustomType.Constructor({"latestRevision","percent","revisionName"})
    private ServiceTraffic(
        @Nullable Boolean latestRevision,
        Integer percent,
        @Nullable String revisionName) {
        this.latestRevision = latestRevision;
        this.percent = Objects.requireNonNull(percent);
        this.revisionName = revisionName;
    }

    public Optional<Boolean> getLatestRevision() {
        return Optional.ofNullable(this.latestRevision);
    }
    public Integer getPercent() {
        return this.percent;
    }
    public Optional<String> getRevisionName() {
        return Optional.ofNullable(this.revisionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTraffic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean latestRevision;
        private Integer percent;
        private @Nullable String revisionName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTraffic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevision = defaults.latestRevision;
    	      this.percent = defaults.percent;
    	      this.revisionName = defaults.revisionName;
        }

        public Builder setLatestRevision(@Nullable Boolean latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }

        public Builder setPercent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }

        public Builder setRevisionName(@Nullable String revisionName) {
            this.revisionName = revisionName;
            return this;
        }

        public ServiceTraffic build() {
            return new ServiceTraffic(latestRevision, percent, revisionName);
        }
    }
}