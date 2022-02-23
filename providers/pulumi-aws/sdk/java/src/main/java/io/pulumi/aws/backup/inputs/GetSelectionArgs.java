// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSelectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSelectionArgs Empty = new GetSelectionArgs();

    /**
     * The backup plan ID associated with the selection of resources.
     * 
     */
    @InputImport(name="planId", required=true)
    private final String planId;

    public String getPlanId() {
        return this.planId;
    }

    /**
     * The backup selection ID.
     * 
     */
    @InputImport(name="selectionId", required=true)
    private final String selectionId;

    public String getSelectionId() {
        return this.selectionId;
    }

    public GetSelectionArgs(
        String planId,
        String selectionId) {
        this.planId = Objects.requireNonNull(planId, "expected parameter 'planId' to be non-null");
        this.selectionId = Objects.requireNonNull(selectionId, "expected parameter 'selectionId' to be non-null");
    }

    private GetSelectionArgs() {
        this.planId = null;
        this.selectionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String planId;
        private String selectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSelectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.planId = defaults.planId;
    	      this.selectionId = defaults.selectionId;
        }

        public Builder setPlanId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder setSelectionId(String selectionId) {
            this.selectionId = Objects.requireNonNull(selectionId);
            return this;
        }
        public GetSelectionArgs build() {
            return new GetSelectionArgs(planId, selectionId);
        }
    }
}
