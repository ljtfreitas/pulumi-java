// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Authorization Profile
 * 
 */
public final class AuthorizationProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthorizationProfileResponse Empty = new AuthorizationProfileResponse();

    /**
     * The approved time
     * 
     */
    @InputImport(name="approvedTime", required=true)
    private final String approvedTime;

    public String getApprovedTime() {
        return this.approvedTime;
    }

    /**
     * The approver
     * 
     */
    @InputImport(name="approver", required=true)
    private final String approver;

    public String getApprover() {
        return this.approver;
    }

    /**
     * The requested time
     * 
     */
    @InputImport(name="requestedTime", required=true)
    private final String requestedTime;

    public String getRequestedTime() {
        return this.requestedTime;
    }

    /**
     * The requester
     * 
     */
    @InputImport(name="requester", required=true)
    private final String requester;

    public String getRequester() {
        return this.requester;
    }

    /**
     * The requester object id
     * 
     */
    @InputImport(name="requesterObjectId", required=true)
    private final String requesterObjectId;

    public String getRequesterObjectId() {
        return this.requesterObjectId;
    }

    public AuthorizationProfileResponse(
        String approvedTime,
        String approver,
        String requestedTime,
        String requester,
        String requesterObjectId) {
        this.approvedTime = Objects.requireNonNull(approvedTime, "expected parameter 'approvedTime' to be non-null");
        this.approver = Objects.requireNonNull(approver, "expected parameter 'approver' to be non-null");
        this.requestedTime = Objects.requireNonNull(requestedTime, "expected parameter 'requestedTime' to be non-null");
        this.requester = Objects.requireNonNull(requester, "expected parameter 'requester' to be non-null");
        this.requesterObjectId = Objects.requireNonNull(requesterObjectId, "expected parameter 'requesterObjectId' to be non-null");
    }

    private AuthorizationProfileResponse() {
        this.approvedTime = null;
        this.approver = null;
        this.requestedTime = null;
        this.requester = null;
        this.requesterObjectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvedTime;
        private String approver;
        private String requestedTime;
        private String requester;
        private String requesterObjectId;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvedTime = defaults.approvedTime;
    	      this.approver = defaults.approver;
    	      this.requestedTime = defaults.requestedTime;
    	      this.requester = defaults.requester;
    	      this.requesterObjectId = defaults.requesterObjectId;
        }

        public Builder setApprovedTime(String approvedTime) {
            this.approvedTime = Objects.requireNonNull(approvedTime);
            return this;
        }

        public Builder setApprover(String approver) {
            this.approver = Objects.requireNonNull(approver);
            return this;
        }

        public Builder setRequestedTime(String requestedTime) {
            this.requestedTime = Objects.requireNonNull(requestedTime);
            return this;
        }

        public Builder setRequester(String requester) {
            this.requester = Objects.requireNonNull(requester);
            return this;
        }

        public Builder setRequesterObjectId(String requesterObjectId) {
            this.requesterObjectId = Objects.requireNonNull(requesterObjectId);
            return this;
        }

        public AuthorizationProfileResponse build() {
            return new AuthorizationProfileResponse(approvedTime, approver, requestedTime, requester, requesterObjectId);
        }
    }
}
