// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.workspaces.inputs.GetBundleArgs;
import com.pulumi.aws.workspaces.inputs.GetDirectoryArgs;
import com.pulumi.aws.workspaces.inputs.GetImageArgs;
import com.pulumi.aws.workspaces.inputs.GetWorkspaceArgs;
import com.pulumi.aws.workspaces.outputs.GetBundleResult;
import com.pulumi.aws.workspaces.outputs.GetDirectoryResult;
import com.pulumi.aws.workspaces.outputs.GetImageResult;
import com.pulumi.aws.workspaces.outputs.GetWorkspaceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WorkspacesFunctions {
    /**
     * Retrieve information about an AWS WorkSpaces bundle.
     * 
     * ## Example Usage
     * ### By ID
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
     *         final var example = Output.of(WorkspacesFunctions.getBundle(GetBundleArgs.builder()
     *             .bundleId(&#34;wsb-b0s22j3d7&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ### By Owner &amp; Name
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
     *         final var example = Output.of(WorkspacesFunctions.getBundle(GetBundleArgs.builder()
     *             .name(&#34;Value with Windows 10 and Office 2016&#34;)
     *             .owner(&#34;AMAZON&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBundleResult> getBundle() {
        return getBundle(GetBundleArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBundleResult> getBundle(GetBundleArgs args) {
        return getBundle(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBundleResult> getBundle(GetBundleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getBundle:getBundle", TypeShape.of(GetBundleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about an AWS WorkSpaces directory.
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
     *         final var example = Output.of(WorkspacesFunctions.getDirectory(GetDirectoryArgs.builder()
     *             .directoryId(&#34;d-9067783251&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDirectoryResult> getDirectory(GetDirectoryArgs args) {
        return getDirectory(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDirectoryResult> getDirectory(GetDirectoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getDirectory:getDirectory", TypeShape.of(GetDirectoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Workspaces image.
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
     *         final var example = Output.of(WorkspacesFunctions.getImage(GetImageArgs.builder()
     *             .imageId(&#34;wsi-ten5h0y19&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args) {
        return getImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getImage:getImage", TypeShape.of(GetImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a workspace in [AWS Workspaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service.
     * 
     * ## Example Usage
     * ### Filter By Workspace ID
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
     *         final var example = Output.of(WorkspacesFunctions.getWorkspace(GetWorkspaceArgs.builder()
     *             .workspaceId(&#34;ws-cj5xcxsz5&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ### Filter By Directory ID &amp; User Name
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
     *         final var example = Output.of(WorkspacesFunctions.getWorkspace(GetWorkspaceArgs.builder()
     *             .directoryId(&#34;d-9967252f57&#34;)
     *             .userName(&#34;Example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspace() {
        return getWorkspace(GetWorkspaceArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getWorkspace:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
}
