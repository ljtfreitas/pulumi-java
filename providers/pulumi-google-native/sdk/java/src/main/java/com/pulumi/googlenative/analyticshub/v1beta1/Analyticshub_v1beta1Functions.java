// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.analyticshub.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetDataExchangeArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetDataExchangeIamPolicyArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetDataExchangeIamPolicyPlainArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetDataExchangeListingIamPolicyArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetDataExchangeListingIamPolicyPlainArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetDataExchangePlainArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetListingArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.inputs.GetListingPlainArgs;
import com.pulumi.googlenative.analyticshub.v1beta1.outputs.GetDataExchangeIamPolicyResult;
import com.pulumi.googlenative.analyticshub.v1beta1.outputs.GetDataExchangeListingIamPolicyResult;
import com.pulumi.googlenative.analyticshub.v1beta1.outputs.GetDataExchangeResult;
import com.pulumi.googlenative.analyticshub.v1beta1.outputs.GetListingResult;
import java.util.concurrent.CompletableFuture;

public final class Analyticshub_v1beta1Functions {
    /**
     * Gets the details of a data exchange.
     * 
     */
    public static Output<GetDataExchangeResult> getDataExchange(GetDataExchangeArgs args) {
        return getDataExchange(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a data exchange.
     * 
     */
    public static CompletableFuture<GetDataExchangeResult> getDataExchangePlain(GetDataExchangePlainArgs args) {
        return getDataExchangePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a data exchange.
     * 
     */
    public static Output<GetDataExchangeResult> getDataExchange(GetDataExchangeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:analyticshub/v1beta1:getDataExchange", TypeShape.of(GetDataExchangeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a data exchange.
     * 
     */
    public static CompletableFuture<GetDataExchangeResult> getDataExchangePlain(GetDataExchangePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:analyticshub/v1beta1:getDataExchange", TypeShape.of(GetDataExchangeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static Output<GetDataExchangeIamPolicyResult> getDataExchangeIamPolicy(GetDataExchangeIamPolicyArgs args) {
        return getDataExchangeIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static CompletableFuture<GetDataExchangeIamPolicyResult> getDataExchangeIamPolicyPlain(GetDataExchangeIamPolicyPlainArgs args) {
        return getDataExchangeIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static Output<GetDataExchangeIamPolicyResult> getDataExchangeIamPolicy(GetDataExchangeIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:analyticshub/v1beta1:getDataExchangeIamPolicy", TypeShape.of(GetDataExchangeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static CompletableFuture<GetDataExchangeIamPolicyResult> getDataExchangeIamPolicyPlain(GetDataExchangeIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:analyticshub/v1beta1:getDataExchangeIamPolicy", TypeShape.of(GetDataExchangeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static Output<GetDataExchangeListingIamPolicyResult> getDataExchangeListingIamPolicy(GetDataExchangeListingIamPolicyArgs args) {
        return getDataExchangeListingIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static CompletableFuture<GetDataExchangeListingIamPolicyResult> getDataExchangeListingIamPolicyPlain(GetDataExchangeListingIamPolicyPlainArgs args) {
        return getDataExchangeListingIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static Output<GetDataExchangeListingIamPolicyResult> getDataExchangeListingIamPolicy(GetDataExchangeListingIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:analyticshub/v1beta1:getDataExchangeListingIamPolicy", TypeShape.of(GetDataExchangeListingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy.
     * 
     */
    public static CompletableFuture<GetDataExchangeListingIamPolicyResult> getDataExchangeListingIamPolicyPlain(GetDataExchangeListingIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:analyticshub/v1beta1:getDataExchangeListingIamPolicy", TypeShape.of(GetDataExchangeListingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a listing.
     * 
     */
    public static Output<GetListingResult> getListing(GetListingArgs args) {
        return getListing(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a listing.
     * 
     */
    public static CompletableFuture<GetListingResult> getListingPlain(GetListingPlainArgs args) {
        return getListingPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a listing.
     * 
     */
    public static Output<GetListingResult> getListing(GetListingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:analyticshub/v1beta1:getListing", TypeShape.of(GetListingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a listing.
     * 
     */
    public static CompletableFuture<GetListingResult> getListingPlain(GetListingPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:analyticshub/v1beta1:getListing", TypeShape.of(GetListingResult.class), args, Utilities.withVersion(options));
    }
}
