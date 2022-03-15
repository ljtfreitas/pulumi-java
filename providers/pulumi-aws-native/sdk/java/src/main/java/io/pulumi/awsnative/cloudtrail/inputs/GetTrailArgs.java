// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTrailArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTrailArgs Empty = new GetTrailArgs();

    @Import(name="trailName", required=true)
      private final String trailName;

    public String getTrailName() {
        return this.trailName;
    }

    public GetTrailArgs(String trailName) {
        this.trailName = Objects.requireNonNull(trailName, "expected parameter 'trailName' to be non-null");
    }

    private GetTrailArgs() {
        this.trailName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String trailName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trailName = defaults.trailName;
        }

        public Builder trailName(String trailName) {
            this.trailName = Objects.requireNonNull(trailName);
            return this;
        }
        public GetTrailArgs build() {
            return new GetTrailArgs(trailName);
        }
    }
}
