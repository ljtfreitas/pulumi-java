// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.RouteArgs;
import com.pulumi.aws.apigatewayv2.inputs.RouteState;
import com.pulumi.aws.apigatewayv2.outputs.RouteRequestParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 route.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html) for [WebSocket](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-develop-routes.html) and [HTTP](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html) APIs.
 * 
 * ## Example Usage
 * ### Basic
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
 *         var exampleApi = new Api(&#34;exampleApi&#34;, ApiArgs.builder()        
 *             .protocolType(&#34;WEBSOCKET&#34;)
 *             .routeSelectionExpression(&#34;$request.body.action&#34;)
 *             .build());
 * 
 *         var exampleRoute = new Route(&#34;exampleRoute&#34;, RouteArgs.builder()        
 *             .apiId(exampleApi.getId())
 *             .routeKey(&#34;$default&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### HTTP Proxy Integration
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
 *         var exampleApi = new Api(&#34;exampleApi&#34;, ApiArgs.builder()        
 *             .protocolType(&#34;HTTP&#34;)
 *             .build());
 * 
 *         var exampleIntegration = new Integration(&#34;exampleIntegration&#34;, IntegrationArgs.builder()        
 *             .apiId(exampleApi.getId())
 *             .integrationType(&#34;HTTP_PROXY&#34;)
 *             .integrationMethod(&#34;ANY&#34;)
 *             .integrationUri(&#34;https://example.com/{proxy}&#34;)
 *             .build());
 * 
 *         var exampleRoute = new Route(&#34;exampleRoute&#34;, RouteArgs.builder()        
 *             .apiId(exampleApi.getId())
 *             .routeKey(&#34;ANY /example/{proxy+}&#34;)
 *             .target(exampleIntegration.getId().apply(id -&gt; String.format(&#34;integrations/%s&#34;, id)))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_route` can be imported by using the API identifier and route identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/route:Route example aabbccddee/1122334
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/route:Route")
public class Route extends com.pulumi.resources.CustomResource {
    /**
     * The API identifier.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * Boolean whether an API key is required for the route. Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="apiKeyRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> apiKeyRequired;

    /**
     * @return Boolean whether an API key is required for the route. Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<Boolean>> apiKeyRequired() {
        return Codegen.optional(this.apiKeyRequired);
    }
    /**
     * The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
     * 
     */
    @Export(name="authorizationScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authorizationScopes;

    /**
     * @return The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
     * 
     */
    public Output<Optional<List<String>>> authorizationScopes() {
        return Codegen.optional(this.authorizationScopes);
    }
    /**
     * The authorization type for the route.
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * For HTTP APIs, valid values are `NONE` for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * Defaults to `NONE`.
     * 
     */
    @Export(name="authorizationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationType;

    /**
     * @return The authorization type for the route.
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * For HTTP APIs, valid values are `NONE` for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * Defaults to `NONE`.
     * 
     */
    public Output<Optional<String>> authorizationType() {
        return Codegen.optional(this.authorizationType);
    }
    /**
     * The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route.
     * 
     */
    @Export(name="authorizerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerId;

    /**
     * @return The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route.
     * 
     */
    public Output<Optional<String>> authorizerId() {
        return Codegen.optional(this.authorizerId);
    }
    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="modelSelectionExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> modelSelectionExpression;

    /**
     * @return The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<String>> modelSelectionExpression() {
        return Codegen.optional(this.modelSelectionExpression);
    }
    /**
     * The operation name for the route. Must be between 1 and 64 characters in length.
     * 
     */
    @Export(name="operationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationName;

    /**
     * @return The operation name for the route. Must be between 1 and 64 characters in length.
     * 
     */
    public Output<Optional<String>> operationName() {
        return Codegen.optional(this.operationName);
    }
    /**
     * The request models for the route. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="requestModels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> requestModels;

    /**
     * @return The request models for the route. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<Map<String,String>>> requestModels() {
        return Codegen.optional(this.requestModels);
    }
    /**
     * The request parameters for the route. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="requestParameters", type=List.class, parameters={RouteRequestParameter.class})
    private Output</* @Nullable */ List<RouteRequestParameter>> requestParameters;

    /**
     * @return The request parameters for the route. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<List<RouteRequestParameter>>> requestParameters() {
        return Codegen.optional(this.requestParameters);
    }
    /**
     * The route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
     * 
     */
    @Export(name="routeKey", type=String.class, parameters={})
    private Output<String> routeKey;

    /**
     * @return The route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
     * 
     */
    public Output<String> routeKey() {
        return this.routeKey;
    }
    /**
     * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="routeResponseSelectionExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> routeResponseSelectionExpression;

    /**
     * @return The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<String>> routeResponseSelectionExpression() {
        return Codegen.optional(this.routeResponseSelectionExpression);
    }
    /**
     * The target for the route, of the form `integrations/`*`IntegrationID`*, where *`IntegrationID`* is the identifier of an `aws.apigatewayv2.Integration` resource.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output</* @Nullable */ String> target;

    /**
     * @return The target for the route, of the form `integrations/`*`IntegrationID`*, where *`IntegrationID`* is the identifier of an `aws.apigatewayv2.Integration` resource.
     * 
     */
    public Output<Optional<String>> target() {
        return Codegen.optional(this.target);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/route:Route", name, state, makeResourceOptions(options, id));
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
    public static Route get(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
