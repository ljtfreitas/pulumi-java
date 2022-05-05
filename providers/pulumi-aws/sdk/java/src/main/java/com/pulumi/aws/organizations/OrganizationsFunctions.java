// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
import com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs;
import com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsArgs;
import com.pulumi.aws.organizations.inputs.GetResourceTagsArgs;
import com.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsResult;
import com.pulumi.aws.organizations.outputs.GetDelegatedServicesResult;
import com.pulumi.aws.organizations.outputs.GetOrganizationResult;
import com.pulumi.aws.organizations.outputs.GetOrganizationalUnitsResult;
import com.pulumi.aws.organizations.outputs.GetResourceTagsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class OrganizationsFunctions {
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
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
     *         final var example = Output.of(OrganizationsFunctions.getDelegatedAdministrators(GetDelegatedAdministratorsArgs.builder()
     *             .servicePrincipal(&#34;SERVICE PRINCIPAL&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDelegatedAdministratorsResult> getDelegatedAdministrators() {
        return getDelegatedAdministrators(GetDelegatedAdministratorsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDelegatedAdministratorsResult> getDelegatedAdministrators(GetDelegatedAdministratorsArgs args) {
        return getDelegatedAdministrators(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDelegatedAdministratorsResult> getDelegatedAdministrators(GetDelegatedAdministratorsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getDelegatedAdministrators:getDelegatedAdministrators", TypeShape.of(GetDelegatedAdministratorsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a list the AWS services for which the specified account is a delegated administrator
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
     *         final var example = Output.of(OrganizationsFunctions.getDelegatedServices(GetDelegatedServicesArgs.builder()
     *             .accountId(&#34;AWS ACCOUNT ID&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDelegatedServicesResult> getDelegatedServices(GetDelegatedServicesArgs args) {
        return getDelegatedServices(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDelegatedServicesResult> getDelegatedServices(GetDelegatedServicesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getDelegatedServices:getDelegatedServices", TypeShape.of(GetDelegatedServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information about the organization that the user&#39;s account belongs to
     * 
     * ## Example Usage
     * ### List all account IDs for the organization
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
     *         final var example = Output.of(OrganizationsFunctions.getOrganization());
     * 
     *         ctx.export(&#34;accountIds&#34;, example.apply(getOrganizationResult -&gt; getOrganizationResult.getAccounts()).stream().map(element -&gt; element.getId()).collect(toList()));
     *         }
     * }
     * ```
     * ### SNS topic that can be interacted by the organization only
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
     *         final var example = Output.of(OrganizationsFunctions.getOrganization());
     * 
     *         var snsTopic = new Topic(&#34;snsTopic&#34;);
     * 
     *         final var snsTopicPolicyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
     *             .statements(GetPolicyDocumentStatement.builder()
     *                 .effect(&#34;Allow&#34;)
     *                 .actions(                
     *                     &#34;SNS:Subscribe&#34;,
     *                     &#34;SNS:Publish&#34;)
     *                 .conditions(GetPolicyDocumentStatementCondition.builder()
     *                     .test(&#34;StringEquals&#34;)
     *                     .variable(&#34;aws:PrincipalOrgID&#34;)
     *                     .values(example.apply(getOrganizationResult -&gt; getOrganizationResult.getId()))
     *                     .build())
     *                 .principals(GetPolicyDocumentStatementPrincipal.builder()
     *                     .type(&#34;AWS&#34;)
     *                     .identifiers(&#34;*&#34;)
     *                     .build())
     *                 .resources(snsTopic.getArn())
     *                 .build())
     *             .build());
     * 
     *         var snsTopicPolicyTopicPolicy = new TopicPolicy(&#34;snsTopicPolicyTopicPolicy&#34;, TopicPolicyArgs.builder()        
     *             .arn(snsTopic.getArn())
     *             .policy(snsTopicPolicyPolicyDocument.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult).apply(snsTopicPolicyPolicyDocument -&gt; snsTopicPolicyPolicyDocument.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult.getJson())))
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrganizationResult> getOrganization() {
        return getOrganization(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationResult> getOrganization(InvokeArgs args) {
        return getOrganization(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationResult> getOrganization(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getOrganization:getOrganization", TypeShape.of(GetOrganizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children.
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
     *         final var org = Output.of(OrganizationsFunctions.getOrganization());
     * 
     *         final var ou = Output.of(OrganizationsFunctions.getOrganizationalUnits(GetOrganizationalUnitsArgs.builder()
     *             .parentId(org.apply(getOrganizationResult -&gt; getOrganizationResult.getRoots()[0].getId()))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrganizationalUnitsResult> getOrganizationalUnits(GetOrganizationalUnitsArgs args) {
        return getOrganizationalUnits(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationalUnitsResult> getOrganizationalUnits(GetOrganizationalUnitsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getOrganizationalUnits:getOrganizationalUnits", TypeShape.of(GetOrganizationalUnitsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get tags attached to the specified AWS Organizations resource.
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
     *         final var account = Output.of(OrganizationsFunctions.getResourceTags(GetResourceTagsArgs.builder()
     *             .resourceId(&#34;123456123846&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceTagsResult> getResourceTags(GetResourceTagsArgs args) {
        return getResourceTags(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResourceTagsResult> getResourceTags(GetResourceTagsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getResourceTags:getResourceTags", TypeShape.of(GetResourceTagsResult.class), args, Utilities.withVersion(options));
    }
}
