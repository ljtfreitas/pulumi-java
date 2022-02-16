// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStudioArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStudioArgs Empty = new GetStudioArgs();

    @InputImport(name="studioId", required=true)
    private final String studioId;

    public String getStudioId() {
        return this.studioId;
    }

    public GetStudioArgs(String studioId) {
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
    }

    private GetStudioArgs() {
        this.studioId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.studioId = defaults.studioId;
        }

        public Builder setStudioId(String studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }

        public GetStudioArgs build() {
            return new GetStudioArgs(studioId);
        }
    }
}