// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionState extends io.pulumi.resources.ResourceArgs {

    public static final PermissionState Empty = new PermissionState();

    /**
     * The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
     * 
     */
    @InputImport(name="eventSourceToken")
    private final @Nullable Input<String> eventSourceToken;

    public Input<String> getEventSourceToken() {
        return this.eventSourceToken == null ? Input.empty() : this.eventSourceToken;
    }

    /**
     * Name of the Lambda function whose resource policy you are updating
     * 
     */
    @InputImport(name="function")
    private final @Nullable Input<String> function;

    public Input<String> getFunction() {
        return this.function == null ? Input.empty() : this.function;
    }

    /**
     * The principal who is getting this permissionE.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
     * 
     */
    @InputImport(name="principal")
    private final @Nullable Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal == null ? Input.empty() : this.principal;
    }

    /**
     * Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARNE.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
     * 
     */
    @InputImport(name="qualifier")
    private final @Nullable Input<String> qualifier;

    public Input<String> getQualifier() {
        return this.qualifier == null ? Input.empty() : this.qualifier;
    }

    /**
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
     * 
     */
    @InputImport(name="sourceAccount")
    private final @Nullable Input<String> sourceAccount;

    public Input<String> getSourceAccount() {
        return this.sourceAccount == null ? Input.empty() : this.sourceAccount;
    }

    /**
     * When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
     * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
     * For S3, this should be the ARN of the S3 Bucket.
     * For EventBridge events, this should be the ARN of the EventBridge Rule.
     * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
     * 
     */
    @InputImport(name="sourceArn")
    private final @Nullable Input<String> sourceArn;

    public Input<String> getSourceArn() {
        return this.sourceArn == null ? Input.empty() : this.sourceArn;
    }

    /**
     * A unique statement identifier. By default generated by this provider.
     * 
     */
    @InputImport(name="statementId")
    private final @Nullable Input<String> statementId;

    public Input<String> getStatementId() {
        return this.statementId == null ? Input.empty() : this.statementId;
    }

    /**
     * A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    @InputImport(name="statementIdPrefix")
    private final @Nullable Input<String> statementIdPrefix;

    public Input<String> getStatementIdPrefix() {
        return this.statementIdPrefix == null ? Input.empty() : this.statementIdPrefix;
    }

    public PermissionState(
        @Nullable Input<String> action,
        @Nullable Input<String> eventSourceToken,
        @Nullable Input<String> function,
        @Nullable Input<String> principal,
        @Nullable Input<String> qualifier,
        @Nullable Input<String> sourceAccount,
        @Nullable Input<String> sourceArn,
        @Nullable Input<String> statementId,
        @Nullable Input<String> statementIdPrefix) {
        this.action = action;
        this.eventSourceToken = eventSourceToken;
        this.function = function;
        this.principal = principal;
        this.qualifier = qualifier;
        this.sourceAccount = sourceAccount;
        this.sourceArn = sourceArn;
        this.statementId = statementId;
        this.statementIdPrefix = statementIdPrefix;
    }

    private PermissionState() {
        this.action = Input.empty();
        this.eventSourceToken = Input.empty();
        this.function = Input.empty();
        this.principal = Input.empty();
        this.qualifier = Input.empty();
        this.sourceAccount = Input.empty();
        this.sourceArn = Input.empty();
        this.statementId = Input.empty();
        this.statementIdPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> eventSourceToken;
        private @Nullable Input<String> function;
        private @Nullable Input<String> principal;
        private @Nullable Input<String> qualifier;
        private @Nullable Input<String> sourceAccount;
        private @Nullable Input<String> sourceArn;
        private @Nullable Input<String> statementId;
        private @Nullable Input<String> statementIdPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.eventSourceToken = defaults.eventSourceToken;
    	      this.function = defaults.function;
    	      this.principal = defaults.principal;
    	      this.qualifier = defaults.qualifier;
    	      this.sourceAccount = defaults.sourceAccount;
    	      this.sourceArn = defaults.sourceArn;
    	      this.statementId = defaults.statementId;
    	      this.statementIdPrefix = defaults.statementIdPrefix;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setEventSourceToken(@Nullable Input<String> eventSourceToken) {
            this.eventSourceToken = eventSourceToken;
            return this;
        }

        public Builder setEventSourceToken(@Nullable String eventSourceToken) {
            this.eventSourceToken = Input.ofNullable(eventSourceToken);
            return this;
        }

        public Builder setFunction(@Nullable Input<String> function) {
            this.function = function;
            return this;
        }

        public Builder setPrincipal(@Nullable Input<String> principal) {
            this.principal = principal;
            return this;
        }

        public Builder setPrincipal(@Nullable String principal) {
            this.principal = Input.ofNullable(principal);
            return this;
        }

        public Builder setQualifier(@Nullable Input<String> qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        public Builder setQualifier(@Nullable String qualifier) {
            this.qualifier = Input.ofNullable(qualifier);
            return this;
        }

        public Builder setSourceAccount(@Nullable Input<String> sourceAccount) {
            this.sourceAccount = sourceAccount;
            return this;
        }

        public Builder setSourceAccount(@Nullable String sourceAccount) {
            this.sourceAccount = Input.ofNullable(sourceAccount);
            return this;
        }

        public Builder setSourceArn(@Nullable Input<String> sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        public Builder setSourceArn(@Nullable String sourceArn) {
            this.sourceArn = Input.ofNullable(sourceArn);
            return this;
        }

        public Builder setStatementId(@Nullable Input<String> statementId) {
            this.statementId = statementId;
            return this;
        }

        public Builder setStatementId(@Nullable String statementId) {
            this.statementId = Input.ofNullable(statementId);
            return this;
        }

        public Builder setStatementIdPrefix(@Nullable Input<String> statementIdPrefix) {
            this.statementIdPrefix = statementIdPrefix;
            return this;
        }

        public Builder setStatementIdPrefix(@Nullable String statementIdPrefix) {
            this.statementIdPrefix = Input.ofNullable(statementIdPrefix);
            return this;
        }
        public PermissionState build() {
            return new PermissionState(action, eventSourceToken, function, principal, qualifier, sourceAccount, sourceArn, statementId, statementIdPrefix);
        }
    }
}
