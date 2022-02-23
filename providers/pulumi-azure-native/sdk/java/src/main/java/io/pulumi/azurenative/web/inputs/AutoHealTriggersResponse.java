// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.RequestsBasedTriggerResponse;
import io.pulumi.azurenative.web.inputs.SlowRequestsBasedTriggerResponse;
import io.pulumi.azurenative.web.inputs.StatusCodesBasedTriggerResponse;
import io.pulumi.azurenative.web.inputs.StatusCodesRangeBasedTriggerResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Triggers for auto-heal.
 * 
 */
public final class AutoHealTriggersResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoHealTriggersResponse Empty = new AutoHealTriggersResponse();

    /**
     * A rule based on private bytes.
     * 
     */
    @InputImport(name="privateBytesInKB")
        private final @Nullable Integer privateBytesInKB;

    public Optional<Integer> getPrivateBytesInKB() {
        return this.privateBytesInKB == null ? Optional.empty() : Optional.ofNullable(this.privateBytesInKB);
    }

    /**
     * A rule based on total requests.
     * 
     */
    @InputImport(name="requests")
        private final @Nullable RequestsBasedTriggerResponse requests;

    public Optional<RequestsBasedTriggerResponse> getRequests() {
        return this.requests == null ? Optional.empty() : Optional.ofNullable(this.requests);
    }

    /**
     * A rule based on request execution time.
     * 
     */
    @InputImport(name="slowRequests")
        private final @Nullable SlowRequestsBasedTriggerResponse slowRequests;

    public Optional<SlowRequestsBasedTriggerResponse> getSlowRequests() {
        return this.slowRequests == null ? Optional.empty() : Optional.ofNullable(this.slowRequests);
    }

    /**
     * A rule based on multiple Slow Requests Rule with path
     * 
     */
    @InputImport(name="slowRequestsWithPath")
        private final @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath;

    public List<SlowRequestsBasedTriggerResponse> getSlowRequestsWithPath() {
        return this.slowRequestsWithPath == null ? List.of() : this.slowRequestsWithPath;
    }

    /**
     * A rule based on status codes.
     * 
     */
    @InputImport(name="statusCodes")
        private final @Nullable List<StatusCodesBasedTriggerResponse> statusCodes;

    public List<StatusCodesBasedTriggerResponse> getStatusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }

    /**
     * A rule based on status codes ranges.
     * 
     */
    @InputImport(name="statusCodesRange")
        private final @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange;

    public List<StatusCodesRangeBasedTriggerResponse> getStatusCodesRange() {
        return this.statusCodesRange == null ? List.of() : this.statusCodesRange;
    }

    public AutoHealTriggersResponse(
        @Nullable Integer privateBytesInKB,
        @Nullable RequestsBasedTriggerResponse requests,
        @Nullable SlowRequestsBasedTriggerResponse slowRequests,
        @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath,
        @Nullable List<StatusCodesBasedTriggerResponse> statusCodes,
        @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange) {
        this.privateBytesInKB = privateBytesInKB;
        this.requests = requests;
        this.slowRequests = slowRequests;
        this.slowRequestsWithPath = slowRequestsWithPath;
        this.statusCodes = statusCodes;
        this.statusCodesRange = statusCodesRange;
    }

    private AutoHealTriggersResponse() {
        this.privateBytesInKB = null;
        this.requests = null;
        this.slowRequests = null;
        this.slowRequestsWithPath = List.of();
        this.statusCodes = List.of();
        this.statusCodesRange = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealTriggersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer privateBytesInKB;
        private @Nullable RequestsBasedTriggerResponse requests;
        private @Nullable SlowRequestsBasedTriggerResponse slowRequests;
        private @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath;
        private @Nullable List<StatusCodesBasedTriggerResponse> statusCodes;
        private @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealTriggersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateBytesInKB = defaults.privateBytesInKB;
    	      this.requests = defaults.requests;
    	      this.slowRequests = defaults.slowRequests;
    	      this.slowRequestsWithPath = defaults.slowRequestsWithPath;
    	      this.statusCodes = defaults.statusCodes;
    	      this.statusCodesRange = defaults.statusCodesRange;
        }

        public Builder setPrivateBytesInKB(@Nullable Integer privateBytesInKB) {
            this.privateBytesInKB = privateBytesInKB;
            return this;
        }

        public Builder setRequests(@Nullable RequestsBasedTriggerResponse requests) {
            this.requests = requests;
            return this;
        }

        public Builder setSlowRequests(@Nullable SlowRequestsBasedTriggerResponse slowRequests) {
            this.slowRequests = slowRequests;
            return this;
        }

        public Builder setSlowRequestsWithPath(@Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath) {
            this.slowRequestsWithPath = slowRequestsWithPath;
            return this;
        }

        public Builder setStatusCodes(@Nullable List<StatusCodesBasedTriggerResponse> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }

        public Builder setStatusCodesRange(@Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange) {
            this.statusCodesRange = statusCodesRange;
            return this;
        }
        public AutoHealTriggersResponse build() {
            return new AutoHealTriggersResponse(privateBytesInKB, requests, slowRequests, slowRequestsWithPath, statusCodes, statusCodesRange);
        }
    }
}
