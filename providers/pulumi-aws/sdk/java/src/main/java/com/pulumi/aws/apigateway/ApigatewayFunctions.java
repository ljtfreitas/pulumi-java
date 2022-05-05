// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.inputs.GetDomainNameArgs;
import com.pulumi.aws.apigateway.inputs.GetExportArgs;
import com.pulumi.aws.apigateway.inputs.GetKeyArgs;
import com.pulumi.aws.apigateway.inputs.GetResourceArgs;
import com.pulumi.aws.apigateway.inputs.GetRestApiArgs;
import com.pulumi.aws.apigateway.inputs.GetSdkArgs;
import com.pulumi.aws.apigateway.inputs.GetVpcLinkArgs;
import com.pulumi.aws.apigateway.outputs.GetDomainNameResult;
import com.pulumi.aws.apigateway.outputs.GetExportResult;
import com.pulumi.aws.apigateway.outputs.GetKeyResult;
import com.pulumi.aws.apigateway.outputs.GetResourceResult;
import com.pulumi.aws.apigateway.outputs.GetRestApiResult;
import com.pulumi.aws.apigateway.outputs.GetSdkResult;
import com.pulumi.aws.apigateway.outputs.GetVpcLinkResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ApigatewayFunctions {
    /**
     * Use this data source to get the custom domain name for use with AWS API Gateway.
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
     *         final var example = Output.of(ApigatewayFunctions.getDomainName(GetDomainNameArgs.builder()
     *             .domainName(&#34;api.example.com&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainNameResult> getDomainName(GetDomainNameArgs args) {
        return getDomainName(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainNameResult> getDomainName(GetDomainNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getDomainName:getDomainName", TypeShape.of(GetDomainNameResult.class), args, Utilities.withVersion(options));
    }
    /**
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
     *         final var example = Output.of(ApigatewayFunctions.getExport(GetExportArgs.builder()
     *             .restApiId(aws_api_gateway_stage.getExample().getRest_api_id())
     *             .stageName(aws_api_gateway_stage.getExample().getStage_name())
     *             .exportType(&#34;oas30&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetExportResult> getExport(GetExportArgs args) {
        return getExport(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetExportResult> getExport(GetExportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getExport:getExport", TypeShape.of(GetExportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the name and value of a pre-existing API Key, for
     * example to supply credentials for a dependency microservice.
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
     *         final var myApiKey = Output.of(ApigatewayFunctions.getKey(GetKeyArgs.builder()
     *             .id(&#34;ru3mpjgse6&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getKey:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the id of a Resource in API Gateway.
     * To fetch the Resource, you must provide the REST API id as well as the full path.
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
     *         final var myRestApi = Output.of(ApigatewayFunctions.getRestApi(GetRestApiArgs.builder()
     *             .name(&#34;my-rest-api&#34;)
     *             .build()));
     * 
     *         final var myResource = Output.of(ApigatewayFunctions.getResource(GetResourceArgs.builder()
     *             .restApiId(myRestApi.apply(getRestApiResult -&gt; getRestApiResult.getId()))
     *             .path(&#34;/endpoint/path&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceResult> getResource(GetResourceArgs args) {
        return getResource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResourceResult> getResource(GetResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getResource:getResource", TypeShape.of(GetResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the id and root_resource_id of a REST API in
     * API Gateway. To fetch the REST API you must provide a name to match against.
     * As there is no unique name constraint on REST APIs this data source will
     * error if there is more than one match.
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
     *         final var myRestApi = Output.of(ApigatewayFunctions.getRestApi(GetRestApiArgs.builder()
     *             .name(&#34;my-rest-api&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRestApiResult> getRestApi(GetRestApiArgs args) {
        return getRestApi(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRestApiResult> getRestApi(GetRestApiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getRestApi:getRestApi", TypeShape.of(GetRestApiResult.class), args, Utilities.withVersion(options));
    }
    /**
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
     *         final var example = Output.of(ApigatewayFunctions.getSdk(GetSdkArgs.builder()
     *             .restApiId(aws_api_gateway_stage.getExample().getRest_api_id())
     *             .stageName(aws_api_gateway_stage.getExample().getStage_name())
     *             .sdkType(&#34;android&#34;)
     *             .parameters(Map.ofEntries(
     *                 Map.entry(&#34;groupId&#34;, &#34;example&#34;),
     *                 Map.entry(&#34;artifactId&#34;, &#34;example&#34;),
     *                 Map.entry(&#34;artifactVersion&#34;, &#34;example&#34;),
     *                 Map.entry(&#34;invokerPackage&#34;, &#34;example&#34;)
     *             ))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSdkResult> getSdk(GetSdkArgs args) {
        return getSdk(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSdkResult> getSdk(GetSdkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getSdk:getSdk", TypeShape.of(GetSdkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the id of a VPC Link in
     * API Gateway. To fetch the VPC Link you must provide a name to match against.
     * As there is no unique name constraint on API Gateway VPC Links this data source will
     * error if there is more than one match.
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
     *         final var myApiGatewayVpcLink = Output.of(ApigatewayFunctions.getVpcLink(GetVpcLinkArgs.builder()
     *             .name(&#34;my-vpc-link&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVpcLinkResult> getVpcLink(GetVpcLinkArgs args) {
        return getVpcLink(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVpcLinkResult> getVpcLink(GetVpcLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getVpcLink:getVpcLink", TypeShape.of(GetVpcLinkResult.class), args, Utilities.withVersion(options));
    }
}
