// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.ResponseArgs;
import com.pulumi.aws.apigateway.inputs.ResponseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Gateway Response for a REST API Gateway.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var main = new RestApi(&#34;main&#34;);
 * 
 *         var test = new Response(&#34;test&#34;, ResponseArgs.builder()        
 *             .restApiId(main.getId())
 *             .statusCode(&#34;401&#34;)
 *             .responseType(&#34;UNAUTHORIZED&#34;)
 *             .responseTemplates(Map.of(&#34;application/json&#34;, &#34;{\&#34;message\&#34;:$context.error.messageString}&#34;))
 *             .responseParameters(Map.of(&#34;gatewayresponse.header.Authorization&#34;, &#34;&#39;Basic&#39;&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_api_gateway_gateway_response` can be imported using `REST-API-ID/RESPONSE-TYPE`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/response:Response example 12345abcde/UNAUTHORIZED
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/response:Response")
public class Response extends com.pulumi.resources.CustomResource {
    /**
     * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    @Export(name="responseParameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> responseParameters;

    /**
     * @return A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    public Output<Optional<Map<String,String>>> responseParameters() {
        return Codegen.optional(this.responseParameters);
    }
    /**
     * A map specifying the templates used to transform the response body.
     * 
     */
    @Export(name="responseTemplates", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> responseTemplates;

    /**
     * @return A map specifying the templates used to transform the response body.
     * 
     */
    public Output<Optional<Map<String,String>>> responseTemplates() {
        return Codegen.optional(this.responseTemplates);
    }
    /**
     * The response type of the associated GatewayResponse.
     * 
     */
    @Export(name="responseType", type=String.class, parameters={})
    private Output<String> responseType;

    /**
     * @return The response type of the associated GatewayResponse.
     * 
     */
    public Output<String> responseType() {
        return this.responseType;
    }
    /**
     * The string identifier of the associated REST API.
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The string identifier of the associated REST API.
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }
    /**
     * The HTTP status code of the Gateway Response.
     * 
     */
    @Export(name="statusCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> statusCode;

    /**
     * @return The HTTP status code of the Gateway Response.
     * 
     */
    public Output<Optional<String>> statusCode() {
        return Codegen.optional(this.statusCode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Response(String name) {
        this(name, ResponseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Response(String name, ResponseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Response(String name, ResponseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/response:Response", name, args == null ? ResponseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Response(String name, Output<String> id, @Nullable ResponseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/response:Response", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Response get(String name, Output<String> id, @Nullable ResponseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Response(name, id, state, options);
    }
}
