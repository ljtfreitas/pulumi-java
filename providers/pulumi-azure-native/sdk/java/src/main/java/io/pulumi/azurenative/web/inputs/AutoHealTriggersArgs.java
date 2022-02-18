// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.RequestsBasedTriggerArgs;
import io.pulumi.azurenative.web.inputs.SlowRequestsBasedTriggerArgs;
import io.pulumi.azurenative.web.inputs.StatusCodesBasedTriggerArgs;
import io.pulumi.azurenative.web.inputs.StatusCodesRangeBasedTriggerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Triggers for auto-heal.
 * 
 */
public final class AutoHealTriggersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoHealTriggersArgs Empty = new AutoHealTriggersArgs();

    /**
     * A rule based on private bytes.
     * 
     */
    @InputImport(name="privateBytesInKB")
    private final @Nullable Input<Integer> privateBytesInKB;

    public Input<Integer> getPrivateBytesInKB() {
        return this.privateBytesInKB == null ? Input.empty() : this.privateBytesInKB;
    }

    /**
     * A rule based on total requests.
     * 
     */
    @InputImport(name="requests")
    private final @Nullable Input<RequestsBasedTriggerArgs> requests;

    public Input<RequestsBasedTriggerArgs> getRequests() {
        return this.requests == null ? Input.empty() : this.requests;
    }

    /**
     * A rule based on request execution time.
     * 
     */
    @InputImport(name="slowRequests")
    private final @Nullable Input<SlowRequestsBasedTriggerArgs> slowRequests;

    public Input<SlowRequestsBasedTriggerArgs> getSlowRequests() {
        return this.slowRequests == null ? Input.empty() : this.slowRequests;
    }

    /**
     * A rule based on multiple Slow Requests Rule with path
     * 
     */
    @InputImport(name="slowRequestsWithPath")
    private final @Nullable Input<List<SlowRequestsBasedTriggerArgs>> slowRequestsWithPath;

    public Input<List<SlowRequestsBasedTriggerArgs>> getSlowRequestsWithPath() {
        return this.slowRequestsWithPath == null ? Input.empty() : this.slowRequestsWithPath;
    }

    /**
     * A rule based on status codes.
     * 
     */
    @InputImport(name="statusCodes")
    private final @Nullable Input<List<StatusCodesBasedTriggerArgs>> statusCodes;

    public Input<List<StatusCodesBasedTriggerArgs>> getStatusCodes() {
        return this.statusCodes == null ? Input.empty() : this.statusCodes;
    }

    /**
     * A rule based on status codes ranges.
     * 
     */
    @InputImport(name="statusCodesRange")
    private final @Nullable Input<List<StatusCodesRangeBasedTriggerArgs>> statusCodesRange;

    public Input<List<StatusCodesRangeBasedTriggerArgs>> getStatusCodesRange() {
        return this.statusCodesRange == null ? Input.empty() : this.statusCodesRange;
    }

    public AutoHealTriggersArgs(
        @Nullable Input<Integer> privateBytesInKB,
        @Nullable Input<RequestsBasedTriggerArgs> requests,
        @Nullable Input<SlowRequestsBasedTriggerArgs> slowRequests,
        @Nullable Input<List<SlowRequestsBasedTriggerArgs>> slowRequestsWithPath,
        @Nullable Input<List<StatusCodesBasedTriggerArgs>> statusCodes,
        @Nullable Input<List<StatusCodesRangeBasedTriggerArgs>> statusCodesRange) {
        this.privateBytesInKB = privateBytesInKB;
        this.requests = requests;
        this.slowRequests = slowRequests;
        this.slowRequestsWithPath = slowRequestsWithPath;
        this.statusCodes = statusCodes;
        this.statusCodesRange = statusCodesRange;
    }

    private AutoHealTriggersArgs() {
        this.privateBytesInKB = Input.empty();
        this.requests = Input.empty();
        this.slowRequests = Input.empty();
        this.slowRequestsWithPath = Input.empty();
        this.statusCodes = Input.empty();
        this.statusCodesRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealTriggersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> privateBytesInKB;
        private @Nullable Input<RequestsBasedTriggerArgs> requests;
        private @Nullable Input<SlowRequestsBasedTriggerArgs> slowRequests;
        private @Nullable Input<List<SlowRequestsBasedTriggerArgs>> slowRequestsWithPath;
        private @Nullable Input<List<StatusCodesBasedTriggerArgs>> statusCodes;
        private @Nullable Input<List<StatusCodesRangeBasedTriggerArgs>> statusCodesRange;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealTriggersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateBytesInKB = defaults.privateBytesInKB;
    	      this.requests = defaults.requests;
    	      this.slowRequests = defaults.slowRequests;
    	      this.slowRequestsWithPath = defaults.slowRequestsWithPath;
    	      this.statusCodes = defaults.statusCodes;
    	      this.statusCodesRange = defaults.statusCodesRange;
        }

        public Builder setPrivateBytesInKB(@Nullable Input<Integer> privateBytesInKB) {
            this.privateBytesInKB = privateBytesInKB;
            return this;
        }

        public Builder setPrivateBytesInKB(@Nullable Integer privateBytesInKB) {
            this.privateBytesInKB = Input.ofNullable(privateBytesInKB);
            return this;
        }

        public Builder setRequests(@Nullable Input<RequestsBasedTriggerArgs> requests) {
            this.requests = requests;
            return this;
        }

        public Builder setRequests(@Nullable RequestsBasedTriggerArgs requests) {
            this.requests = Input.ofNullable(requests);
            return this;
        }

        public Builder setSlowRequests(@Nullable Input<SlowRequestsBasedTriggerArgs> slowRequests) {
            this.slowRequests = slowRequests;
            return this;
        }

        public Builder setSlowRequests(@Nullable SlowRequestsBasedTriggerArgs slowRequests) {
            this.slowRequests = Input.ofNullable(slowRequests);
            return this;
        }

        public Builder setSlowRequestsWithPath(@Nullable Input<List<SlowRequestsBasedTriggerArgs>> slowRequestsWithPath) {
            this.slowRequestsWithPath = slowRequestsWithPath;
            return this;
        }

        public Builder setSlowRequestsWithPath(@Nullable List<SlowRequestsBasedTriggerArgs> slowRequestsWithPath) {
            this.slowRequestsWithPath = Input.ofNullable(slowRequestsWithPath);
            return this;
        }

        public Builder setStatusCodes(@Nullable Input<List<StatusCodesBasedTriggerArgs>> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }

        public Builder setStatusCodes(@Nullable List<StatusCodesBasedTriggerArgs> statusCodes) {
            this.statusCodes = Input.ofNullable(statusCodes);
            return this;
        }

        public Builder setStatusCodesRange(@Nullable Input<List<StatusCodesRangeBasedTriggerArgs>> statusCodesRange) {
            this.statusCodesRange = statusCodesRange;
            return this;
        }

        public Builder setStatusCodesRange(@Nullable List<StatusCodesRangeBasedTriggerArgs> statusCodesRange) {
            this.statusCodesRange = Input.ofNullable(statusCodesRange);
            return this;
        }

        public AutoHealTriggersArgs build() {
            return new AutoHealTriggersArgs(privateBytesInKB, requests, slowRequests, slowRequestsWithPath, statusCodes, statusCodesRange);
        }
    }
}
