// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAccessReviewScheduleDefinitionByIdArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessReviewScheduleDefinitionByIdArgs Empty = new GetAccessReviewScheduleDefinitionByIdArgs();

    /**
     * The id of the access review schedule definition.
     * 
     */
    @InputImport(name="scheduleDefinitionId", required=true)
        private final String scheduleDefinitionId;

    public String getScheduleDefinitionId() {
        return this.scheduleDefinitionId;
    }

    public GetAccessReviewScheduleDefinitionByIdArgs(String scheduleDefinitionId) {
        this.scheduleDefinitionId = Objects.requireNonNull(scheduleDefinitionId, "expected parameter 'scheduleDefinitionId' to be non-null");
    }

    private GetAccessReviewScheduleDefinitionByIdArgs() {
        this.scheduleDefinitionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessReviewScheduleDefinitionByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessReviewScheduleDefinitionByIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleDefinitionId = defaults.scheduleDefinitionId;
        }

        public Builder setScheduleDefinitionId(String scheduleDefinitionId) {
            this.scheduleDefinitionId = Objects.requireNonNull(scheduleDefinitionId);
            return this;
        }
        public GetAccessReviewScheduleDefinitionByIdArgs build() {
            return new GetAccessReviewScheduleDefinitionByIdArgs(scheduleDefinitionId);
        }
    }
}
