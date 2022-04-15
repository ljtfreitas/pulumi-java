// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTraffic extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTraffic Empty = new GetServiceTraffic();

    @Import(name="latestRevision", required=true)
      private final Boolean latestRevision;

    public Boolean latestRevision() {
        return this.latestRevision;
    }

    @Import(name="percent", required=true)
      private final Integer percent;

    public Integer percent() {
        return this.percent;
    }

    @Import(name="revisionName", required=true)
      private final String revisionName;

    public String revisionName() {
        return this.revisionName;
    }

    public GetServiceTraffic(
        Boolean latestRevision,
        Integer percent,
        String revisionName) {
        this.latestRevision = Objects.requireNonNull(latestRevision, "expected parameter 'latestRevision' to be non-null");
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
        this.revisionName = Objects.requireNonNull(revisionName, "expected parameter 'revisionName' to be non-null");
    }

    private GetServiceTraffic() {
        this.latestRevision = null;
        this.percent = null;
        this.revisionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTraffic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean latestRevision;
        private Integer percent;
        private String revisionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTraffic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevision = defaults.latestRevision;
    	      this.percent = defaults.percent;
    	      this.revisionName = defaults.revisionName;
        }

        public Builder latestRevision(Boolean latestRevision) {
            this.latestRevision = Objects.requireNonNull(latestRevision);
            return this;
        }
        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }
        public Builder revisionName(String revisionName) {
            this.revisionName = Objects.requireNonNull(revisionName);
            return this;
        }        public GetServiceTraffic build() {
            return new GetServiceTraffic(latestRevision, percent, revisionName);
        }
    }
}
